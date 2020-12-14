package com.kthiruk.tests

import com.kthiruk.test_git._
import org.scalatest.flatspec.AnyFlatSpec

class test_git extends AnyFlatSpec {
    val a = new MyTest
    "MyTest.add_numbers(3,4)" should "return 7" in {
      assert(a.add_numbers(3, 4) == 7)
    }

  "MyTest.add_numbers(3,4,5)" should "return 12" in {
    assert(a.add_numbers(3, 4,5) == 12)
  }

  "MyTest.sub_numbers(5,4)" should "return 1" in {
    assert(a.sub_numbers(5,4) == 1)
  }

  "MyTest.sub_numbers(4,5)" should "return -1" in {
    assert(a.sub_numbers(4,5) == -1)
  }

  "MyTest.sub_numbers(4,5)" should "return -1" in {
    assert(a.sub_numbers(4,10) == -6)
  }
}