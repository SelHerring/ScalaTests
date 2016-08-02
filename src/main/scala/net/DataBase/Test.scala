package net.DataBase.Spikes

import org.squeryl.Session
import org.squeryl.adapters.MSSQLServer
import org.squeryl.SessionFactory
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Schema

// Create a Customer class which has the same fields as the Customer table in SQL Server
case class Customer(id: Long, name: String) {}

object SqlSpike extends App with Schema {
  val databaseConnectionUrl = "Server=s-bak-01;Failover partner=cg-db-21;Database=OrganizationsStorage7;integrated security=sspi;"
  val databaseUsername = "kad/d.soldatenkov"
  val databasePassword = "password"

  // Set the jtds driver
  Class.forName("net.sourceforge.jtds.jdbc.Driver")

  // Connect to the database
  SessionFactory.concreteFactory = Some(() =>
    Session.create(
      java.sql.DriverManager.getConnection(databaseConnectionUrl, databaseUsername, databasePassword),
      new MSSQLServer))

  // Setup the Customer class to be mapped to the "Customer" table in SQL Server
  val customers = table[Customer]("Customer")

  // Select Customer with id=1 from the Customer table
  transaction {
    val customer = customers.where(c => c.id === 1).single
    println("Customer name: " + customer.name)
  }
}