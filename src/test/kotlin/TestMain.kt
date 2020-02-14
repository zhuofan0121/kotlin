import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TestMain : StringSpec({
    "test the add method" {
        assert((add(5, 6)) == 11)
        add(5, 6) shouldBe 11
        require(add(0, 7) == 7)
    }
})

class TestHello : StringSpec({
    "test the hello method" {
        hello() shouldBe "Hello World!"
    }
})
