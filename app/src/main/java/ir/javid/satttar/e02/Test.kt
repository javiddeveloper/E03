package ir.javid.satttar.e02

/**
 * @author  : Javid
 * @summary : Test
 */

fun main() {
    var a: Int = 0 // Mutable
    a = 12
    a = -12

    val b: Int = 0 // read only Immutable
//    b=12
//    b=-12

    // scope function
    var name: String? = null
    name = "ali"

// check if not null
    name?.let { value ->
        print(value)
    } ?: run {
        print("print null")
    }

    if (name != null){
        print(name)
    } else {
        print("print null")
    }

    // when
    var age: Int = 0
    age = 12

    when {
        age == 12 -> {
            print("child")
        }
        age > 12 -> {
            print("young")
        }
        age < 12 -> {
            print("baby")
        }
    }

    when {
        name != null -> {
            print(name)
        }
        else ->{
            print("print null")
        }
    }

}