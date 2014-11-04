package com.indy

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSpec

class AlbumFixtureTraitSpec extends FunSpec with ShouldMatchers {

  // trait can be declared in any other file and mixed in
  trait AlbumFixture {
    val letterFromHome = new Album("Letter from Home", 1989, new Band("Pat Metheny Group"))
  }

  describe("The Letter From Home Album by Pat Metheny") {
    it("should get the year 1989 from the album") {

      // new is creating the anonymous trait and using its memeber vars as it is in scope
      new AlbumFixture {
        letterFromHome.year should be(1989)
      }
    }
  }
}
