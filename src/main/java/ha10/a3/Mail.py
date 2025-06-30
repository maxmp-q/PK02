class Mail:
    def __init__(self, senders_address, subject, message, datetime, read):
        self._senders_address = senders_address
        self._subject = subject
        self._message = message
        self._datetime = datetime
        self._read = read

    def mark_read(self, read):
        self._read = read

    def printMail(self):
        return(f"{self._subject} from {self._senders_address} on {self._datetime}: self._message")

    def is_read(self):
        return self._read

    def get_subject(self):
        return self._subject

    def get_senders_address(self):
        return self._senders_address

    def get_datetime(self):
        return self._datetime