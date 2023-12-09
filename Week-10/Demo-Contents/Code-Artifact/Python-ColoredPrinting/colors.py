
from colorama import Fore, Back, Style

print("Normal text")


print(Fore.BLUE, "Text with foreground as Blue")
print(Style.RESET_ALL)

print(Fore.RED)
print(Back.GREEN, "Text with foreground as Red and Background as Green")
print(Style.RESET_ALL)

