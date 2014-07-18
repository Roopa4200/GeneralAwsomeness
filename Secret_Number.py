import random

secret = random.randint(1, 99)
guess = 0
tries = 0

print "I have a secret number between 1 and 99, that I want you to guess!"
print "You will get 6 tries."

while guess != secret and tries < 6:
    guess = input ("What is your guess?")
    if (guess > secret):
        print "Too high!"
    elif (guess < secret):
        print "Too low!"
    tries = tries + 1

if guess == secret:
    print "You're really good at finding secrets!"
else:
    print "You're out of chances! Maybe next time!"
    print "The secret number was", secret
