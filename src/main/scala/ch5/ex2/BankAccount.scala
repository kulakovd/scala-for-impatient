package ch5.ex2

class BankAccount {
	private var accountBalance: Double = 0

	def balance: Double = accountBalance

	def deposit(v: Double): Unit = {
		accountBalance += v
	}

	def withdraw(v: Double): Unit = {
		if (accountBalance - v >= 0)
			accountBalance -= v
	}
}
