fun main() {
    var atm: Array<String> = arrayOf("1. $5","2. $10","3. $20","4. $50")
    var choice = -1
    var loopvar = 0

    while(choice !in 0..atm.size - 1){
        loopvar = 0
        println("Please choose a number (1-4) to withdraw: ")
        while (loopvar < atm.size){
            println(atm.get(loopvar))
            loopvar ++
        }
        print("")
        choice = readLine()!!.toInt() - 1

        if (choice !in 0..atm.size - 1)
            println("Invalid Entry, try again")
    }

    println("You have selected " + atm[choice])

}