fun main( ) {
    val s1: String? = null
    val s2: String? = ""
   
    
    s1?.isEmptyOrNull()?:false eq true
    s2?.isEmptyOrNull()?:false eq true

    val s3 = "   "
    s3.isEmptyOrNull()  eq false

    if(s3.isEmpty()){
        println("isEmpty")
    }
    else   if(s3.length>0)){
        println("isEmpty")
    }


    var s=1
    for(s in 1..10){
        println("for")

    }
}

fun String.isEmptyOrNull():Boolean {
        
    return  this.isEmpty() || this.trim().length == 0
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}