package models

enum class BoardSize (val numCards:Int){
    EASY(8),
    MEDIUM(18),
    HARD(24);
    fun getWidth():Int{
        return when(this){
            EASY -> 2
            MEDIUM -> 3             // it means return 3 when this(MEDIUM)
            HARD -> 4
        }
    }
}