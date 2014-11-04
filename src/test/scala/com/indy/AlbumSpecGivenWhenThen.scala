package com.indy

import org.scalatest.{Tag, GivenWhenThen, FunSpec}
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.WrappedArray

// using given when then

class AlbumSpec extends FunSpec with ShouldMatchers with GivenWhenThen {

      // the fixture decalres an object that would be called before every test, like @BeforeTest
      def fixture = new {
        val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
      }


      describe("An Album object") {

        it("can add an Artist to the album at construction time") {

          given("The album Thriller by Michael Jackson")
          // this can be created here or in the fixture
          // val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))

          when("the album\'s artist is obtained")
          val artist = fixture.album.artist

          then("the artist obtained should be an instance of Artist")
          artist.isInstanceOf[Artist] should be (true)
          and("the artist's first name and last name should be Michael Jackson")

          artist.fname should be("Michael")
          artist.surname should be("Jackson")
        }
  }
}
