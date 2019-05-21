package ch8.ex2

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
	private val freeTransactions = 3
	private var doneTransactionsCount = 0

	override def deposit(amount: Double): Double = {
		if (doneTransactionsCount < freeTransactions) {
			super.deposit(amount)
		} else {
			if (currentBalance + amount >= 1) {
				super.deposit(amount)
				super.withdraw(1)
			}
		}

		doneTransactionsCount += 1
		currentBalance
	}

	override def withdraw(amount: Double): Double = {
		if (doneTransactionsCount < freeTransactions) {
			super.withdraw(amount)
		} else {
			super.withdraw(amount + 1)
		}

		doneTransactionsCount += 1
		currentBalance
	}

	def earnMonthlyInterest(percent: Double): Unit = {
		doneTransactionsCount = 0

		super.deposit(currentBalance * percent)
	}
}
