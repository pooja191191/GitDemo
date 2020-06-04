$title = "Authentication Required"
WinWaitActive($title)
Send("username")
Send("{Tab}")
Send("password")
Send("{ENTER}")
