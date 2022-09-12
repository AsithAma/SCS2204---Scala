object Main extends App{
  var acc1 = new Account("1234", 2222, 1000);
  var acc2 = new Account("1235", 3333, 2000);

  println("Account 1: " + acc1.getBalance);
  println("Account 2: " + acc2.getBalance);

  println("Transfer 500 from Account 1 to Account 2");
  acc1.transfer(500, acc2);

  println("Account 1: " + acc1.getBalance);
  println("Account 2: " + acc2.getBalance);
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
