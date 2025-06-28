class Inbox:
    def __init__(self):
        self._mails = []

    def add_mail(self, mail):
        self._mails.append(mail)

    def remove_mail(self, mail):
        if mail in self._mails:
            self._mails.remove(mail)

    def open(self, index):
        try:
            return self._mails[index].printMail()
        except IndexError:
            raise IndexError("Index out of bound")

    def count_unread(self):
        return sum(1 for mail in self._mails if not mail.is_read())

    def print_all_emails(self):
        printed_mails = []

        for mail in self._mails:
            status = "Read" if mail.is_read() else "Unread"
            line = f"{status} | {mail.get_subject()} | {mail.get_senders_address()} | {mail.get_datetime()}"
            printed_mails.append(line)

        return printed_mails

