using Microsoft.VisualStudio.TestTools.UnitTesting;
using PaymentContext.Domain.Commands;
using PaymentContext.Domain.Entities;
using PaymentContext.Domain.Enums;
using PaymentContext.Domain.Handlers;
using PaymentContext.Domain.ValueObjects;
using PaymentContext.Tests.Mocks;
using System;

namespace PaymentContext.Tests
{
    [TestClass]
    public class SubscriptionHandlerTests
    {
        [TestMethod]
        public void ShouldReturnErrorWhenDocumentExists()
        {
            var handler = new SubscriptionHandler(new FakeStudentRepository(), new FakeEmailService());
            var command = new CreateBoletoSubscriptionCommand();
            command.FirstName = "Bia";
            command.LastName = "Ferreira";
            command.Document = "99999999999";
            command.Email = "ela@email.com";
            command.BarCode = "123456789";
            command.BoletoNumber = "123456987";
            command.PaymentNumber = "123121";
            command.PaidDate = DateTime.Now;
            command.ExpireDate = DateTime.Now.AddMonths(1);
            command.Total = 60;
            command.TotalPaid = 60;
            command.Payer = "Bia Ferreira";
            command.PayerDocument = "12345678911";
            command.PayerDocumentType = EDocumentType.CPF;
            command.PayerEmail = "ela@email.com";
            command.Street = "asdfg";
            command.Number = "gfdsa";
            command.Neighborhood = "edcvfr";
            command.City = "Curitiba";
            command.State = "pr";
            command.Country = "br";
            command.ZipCode = "80030330";

            handler.Handle(command);
            Assert.AreEqual(false, handler.Valid);
        }   
    }
}