package ch8.ex2

class BankAccount(initialBalance: Double) {
	private var balance = initialBalance

	def currentBalance: Double = balance

	def deposit(amount: Double): Double = { balance += amount; balance }

	def withdraw(amount: Double): Double = { balance -= amount; balance }
}