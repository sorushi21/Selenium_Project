;Wait for 10 seconds to get the upload popup open
Local $winId=WinWait("[CLASS:#32770]","",10)

;Set focus on File Name text field of upload window
ControlFocus($winId,"","Edit1")

;wait for 2 seconds
Sleep(2000)

;Set filepath
ControlSetText($winId,"","Edit1","G:\AccelerationNew\Jan_9_Selenium\AutoItFiles\"&$CmdLine[1])

ControlClick($winId,"","Button1")