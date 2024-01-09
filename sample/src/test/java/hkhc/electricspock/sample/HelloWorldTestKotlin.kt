package hkhc.electricspock.sample

import junit.framework.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class HelloWorldTestKotlin {
    @Test
    fun test1() {
        val mainActivity = Robolectric.buildActivity(MainActivity::class.java).create().get()

        val text = mainActivity.helloTextView.text

        Assert.assertEquals(
                "Hello World!", text)
    }
}