package com.indy

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.WrappedArray


class AlbumTest extends FunSpec with ShouldMatchers  {
 describe("An Album") {
   it ("can add an Artist object to the album") {
     val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
     album.artist.fname should be ("Michael")

     var mlist = album.artist.fname :: Nil
     mlist = album.artist.surname :: mlist

     // val s = album.artist.surname
     mlist should contain("Michael")
     mlist should have length (2)

     // a way to test properties
     album should have (
                        'title ("Thriller"),
                        'year (1981),
                        'artist (new Artist("Michael", "Jackson"))
                        )

   }

   it ("should handle exceptions gracefully") {
     val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))

     val thrownException = evaluating {
      new Album("The Joy of Listening to Nothing", 1980, new Artist("", "Jackson"))

          } should produce [IllegalArgumentException] // this is the first test

          thrownException.getMessage() should be ("An artist fname cannot be empty") // this is the next test


        }

      }
    }











