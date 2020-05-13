using Microsoft.VisualStudio.TestTools.UnitTesting;
using PaymentContext.Domain.Commands;
using PaymentContext.Domain.Entities;
using PaymentContext.Domain.Enums;
using PaymentContext.Domain.Handlers;
using PaymentContext.Domain.Queries;
using PaymentContext.Domain.ValueObjects;
using PaymentContext.Tests.Mocks;
using System;
using System.Collections.Generic;
using System.Linq;

namespace PaymentContext.Tests.Queries
{
    [TestClass]
    public class StudentQueriesTests
    {
        private IList<Student> _students;

        public StudentQueriesTests()
        {
            for (var i = 0; i <= 10; i++)
            {
                _students.Add(new Student(new Name("Aluno", i.ToString()),
                    new Document("1111111111" + i.ToString(), EDocumentType.CPF),
                    new Email(i.ToString() + "@email.com")
                ));

            }
        }

        [TestMethod]
        public void ShouldReturnNullWhenDocumentDoesNotExist()
        {
            var exp = StudentQueries.GetStudentInfo("12345678911");
            var stdn = _students.AsQueryable().Where(exp).FirstOrDefault();

            Assert.AreEqual(null, stdn);
        }


        [TestMethod]
        public void ShouldReturnStudentWhenDocumentExists()
        {
            var exp = StudentQueries.GetStudentInfo("11111111111");
            var stdn = _students.AsQueryable().Where(exp).FirstOrDefault();

            Assert.AreNotEqual(null, stdn);
        }
    }
}
