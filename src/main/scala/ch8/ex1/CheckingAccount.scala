package ch8.ex1

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

	override def deposit(amount: Double): Double = {
		if (currentBalance + amount >= 1) {
			super.deposit(amount)
			super.withdraw(1)
		}
		currentBalance
	}

	override def withdraw(amount: Double): Double = {
		super.withdraw(amount + 1)
	}
}
