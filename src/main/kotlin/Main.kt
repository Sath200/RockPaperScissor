import java.util.Scanner
fun main(args: Array<String>) {

    println("Rock Paper Scissors!!")
    game()
}
fun user_choice(): Int{
    println("Pick your choice!")
    println("1--Rock")
    println("2--Paper")
    println("3--Scissors")
    println("Enter your choice:  1/2/3")
    var reader=Scanner(System.`in`)
    var input=reader.nextInt()
    return input
}
fun computer_choice():Int{
    var computer=(1..3).random()
    if (computer==1){
        println(" Computer chose Rock")
    }
    else if (computer==2){
        println("Computer chose Paper")
    }
    else
    {
        println("Computer chose Scissors")
    }
    return computer
}
fun game(){
    var i=0
    var user_win=0
    var comp_win=0
    for (i in 1..3){
        var user=user_choice()
        var computer=computer_choice()
        if (user==computer){
            println("This round is a tie")
            continue
        }
        else if((user==1 && computer==3)||(user==2 && computer==1)||(user==3 && computer==2)){
            println("You won this round")
            user_win+=1
        }
        else
        {
            println("Computer won this round")
            comp_win+=1
        }

    }
    println("FINAL RESULT:")
    if(user_win==comp_win){
        println("It's a Tie!!!")
    }
    else if(user_win>comp_win){
        println("You wonn!!!")
    }
    else{
        println("Computer won! Better luck next time!")
    }

}

