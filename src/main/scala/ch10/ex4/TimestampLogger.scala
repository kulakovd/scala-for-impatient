package ch10.ex4

// Добавил, чтобы поигратьс с порядеом трейтов
trait TimestampLogger extends Logger {
	abstract override def log(msg: String) {
		super.log(s"${java.time.Instant.now()} $msg")
	}
}