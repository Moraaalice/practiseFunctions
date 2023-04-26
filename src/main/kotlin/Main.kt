fun main(){
var two = twoNum(12,19)
    println(two)
    //
    var arr = takeNum(arrayOf(12,45,23,18))
    println(arr)
    //
    var taking = takeStr("alicia")
    println(taking)
    //
    var rever = reverse("mother")
    println(rever.reversed())
    //
    var taken = takeList(listOf(12,34,23,89,28,45,1,3,7))
    println(taken)
    //
    var str = strLists(listOf("alice","dante","mary","juan"))
    println(str)
    //
    var digit = digits(listOf(2,34,1,98,34,78,35,21))
    println(digit)
    //
    var strr = joinStr(listOf("nakuru","nairobi","kisumu","nyandarua"))
    println(strr)
    //
    var strA = arrStrings(arrayOf("Alice","Winnifrida","Brian"))
    println(strA)
    //
    var x = counting("jauan")
    println(x)
    //
    var twost = twoStr("binary","brainy")
    println(twost)
}
//Write a function that takes two integers as parameters and returns their sum.
fun twoNum(num1:Int,num2:Int):Int{
    var sum = num1+num2
    return sum
}
//Write a function that takes an array of integers as a parameter and returns the sum of all the elements.
fun takeNum(digit:Array<Int>):Int{
    var sum = 0
    for (d in digit)
        sum+=d
    return sum
}
//Write a function that takes an array of strings as a parameter
//and returns the length of the longest string.
fun arrStrings(arrstr:Array<String>):Int{
    var len = 0
    for (r in arrstr)
        if (r.length>len){
            len = r.length

        }
    return len
}
//Write a function that takes a string as a parameter and returns the number of vowels in the string.
fun takeStr(name:String):Int{
    var count = 0
    for (n in name)
    if (n=='a'|| n=='e'||n=='i'||n=='o'||n=='u'){
        count++
    }
    return count
}
fun counting(wording:String):Int{
    var wor = arrayOf('a','e','i','o','u','A','E','I','O','U')
    var count = 0
    for (w in wording){
        if (w in wor){
            count+=1
        }

    }
    return count

}
//Write a function that takes a string as a parameter and returns the string in reverse order.
fun reverse(word:String):String{
    if (word.isEmpty()){

    }
    return word
}
//Write a function that takes two strings as parameters and returns true if they are anagrams
// (have the same letters in a different order) and false otherwise.
fun twoStr(str1:String,str2: String):Boolean{
    if (str1 != str2){
        return false
    }else
        return true
}
//Write a function that takes a list of integers as a parameter and returns a new list with all
 //the even numbers removed.
fun takeList(num:List<Int>):List<Int>{
    var new = mutableListOf<Int>()
   for (n in num){
       if (n%2!=0){
           new.addAll(listOf(n))
       }
   }
    return new
}
//Write a function that takes a list of integers as a parameter and returns the second largest
// element in the list.
fun digits(digit:List<Int>):Int{
    var numb = digit.sortedDescending()
    return numb[1]
}
//Write a function that takes a list of strings as a parameter and returns a
// new list with all the strings in uppercase.
fun strLists(words:List<String>):List<String>{
    var newList = mutableListOf<String>()
    var newWords = words.map { w -> w.uppercase() }
    newList.addAll(newWords)
    return newList
}
//Write a function that takes a list of strings as a parameter and returns the concatenation
// of all the strings.
fun joinStr(naming:List<String>):String{
    var join = naming.reduce { joan , alice -> joan + alice }
    return join
}




