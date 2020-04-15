using System;
using Xunit;

namespace Gradebook.tests
{
    public class BookTests
    {
        [Fact]
        public void BookCalculatesAnAverageGrade()
        {
            // arrange
            var book = new InMemoryBook("");
            book.AddGrade(9.1);
            book.AddGrade(8.5);
            book.AddGrade(7.3);

            // act
            var result = book.GetStats();

            // assert
            Assert.Equal(8.3, result.Average, 1);
            Assert.Equal(9.1, result.High, 1);
            Assert.Equal(7.3, result.Low, 1);
            Assert.Equal('B', result.Letter);
        }
    }
}
