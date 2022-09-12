object Main extends App {
  var accounts: List[Account] = new Account("1", 1, 1000) :: new Account("2", 2, 2000) :: new Account("3", 3, 3000) :: new Account("4", 4, -1000) :: Nil

  var overdraft: List[Account] = accounts.filter(x => x.getBalance < 0).toList;

  println("Overdraft Accounts: ");
  overdraft.foreach(x => println(x));

  var balance: Double = accounts.map(x => x.getBalance).reduce((x, y) => x + y);

  println("Total Balance: " + balance);

  accounts.foreach(x => x.interest());

  println("Interest: ");
  accounts.foreach(x => println(x));
}

class Account(id:String,n:Int,b:Double) {
  private var nic:String = id;
  private var acnumber:Int = n;
  private var balance:Double = b;

  def deposit(amount: Double): Unit = {
    balance += amount;
  }

  def withdraw(amount: Double): Unit = {
    balance -= amount;
  }

  def transfer(amount: Double, another: Account): Unit = {
    this.withdraw(amount);
    another.deposit(amount);
  }

  def interest(): Unit = {
    if (balance >= 0) balance += balance * 0.05;
    else balance += balance * 0.1;
  }

  def getBalance: Double = balance;

  override def toString: String = "Account : " + nic + " Balance: " + balance;
}