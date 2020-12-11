package com.kthiruk.test_git

object test_git_object {
  def main(args: Array[String]): Unit = {
    val a = "This is to test git ci workflow"
    println(a)

    val b = new MyTest
    println("The addition result is : " + b.add_numbers(3,4))

    println("The addition result is : " + b.add_numbers(3,4,7))

    println("The Sub result is : " + b.sub_numbers(4,3))
  }
}
