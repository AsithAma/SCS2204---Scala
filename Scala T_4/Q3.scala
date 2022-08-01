object Question3{
    def toUpper(str: String): String = {
        str.toUpperCase
    }

    def toLower(str: String): String = {
        str.toLowerCase
    }

    def formatNames(name: String, format: String => String): String = {
        format(name)
    }

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan", toLower))
        println(formatNames("Saman", toUpper))
        println(formatNames("KumarA", toLower))
    }
    
}