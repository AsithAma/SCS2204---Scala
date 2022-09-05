object CeasarCipher {
    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    def encrypt(mssg: String, shift: Int): String = {
        mssg.map((c: Char) => {
            var indx = alphabet.indexOf(c.toUpper);
            if(indx == -1)
                c
            else
                alphabet((indx + shift) % alphabet.length);
        });
    }

    def decrypt(mssg: String, shift: Int): String = {
        mssg.map((c: Char) => {
            var indx = alphabet.indexOf(c);
            var x = indx-shift;
            if(indx == -1)
                c
            else if(x>=0) 
                alphabet(x);
            else
                alphabet(alphabet.length + x);
        })
    }

    def main(args: Array[String]): Unit = {

        print("Enter Shift: ");
        var shift = (scala.io.StdIn.readInt() + alphabet.length) % alphabet.length;

        print("Enter the message: ")
        val msg = scala.io.StdIn.readLine()

        println("Encrypt Message: " + encrypt(msg, shift));
        println("Decrypt Message: " + decrypt(msg, shift));
        
    }
}