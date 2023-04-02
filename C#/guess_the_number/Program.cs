(int secretNumber, int countOfAttempts, string playerName) = Welcome();
if (secretNumber == -99) Console.WriteLine("G A M E   O V E R!");
else
{
    Console.Clear();
    Console.WriteLine($"Ok, {playerName}, " + getGameMessages("I guess a Number!"));
    for (int i = 0; i < countOfAttempts; i++)
    {    
        int userNumber = makeMove(countOfAttempts - i, playerName);
        if (checkNumber(userNumber, secretNumber)) 
        {
            Console.WriteLine(gameOver(0));
            i = countOfAttempts;
        }
        if (userNumber > secretNumber) Console.WriteLine(getGameMessages("greater"));
        if (userNumber < secretNumber) Console.WriteLine(getGameMessages("less"));
        if (i == countOfAttempts -1) Console.WriteLine(gameOver(1));
    } 
}

(int, int, string) Welcome()
{
    Console.WriteLine(getGameMessages("Welcome"));
    string playerName = Console.ReadLine();
    Console.WriteLine(getGameMessages("Hello") + playerName + "!" + getGameMessages("Rules"));
    string str = getGameMessages("PlayOrNo");
    if (userAnswer(str))
    {
        (int secretNumber, int countOfAttempts) = initGame(playerName); 
        return (secretNumber, countOfAttempts, playerName);
    }
    else
    {
        return (secretNumber = -99, countOfAttempts = -99, playerName);
    }
}

int requestNumber(string words) // input of numbers with validation 
{
    while (true)
    {
        Console.Write(words);
        if (int.TryParse(Console.ReadLine(), out int num) && num > 0) return num;
        else Console.WriteLine(getGameMessages("requestNumber"));
    }
}

bool userAnswer(string MessageValue) //waiting for user response 
{
    Console.WriteLine(MessageValue);
    string answer = Console.ReadLine();
    return answer.ToLower() == "y";     //if "y" is pressed, it returns true 
}

string getGameMessages(string arg)
{
    switch (arg)
    {
        case "Welcome":
            return "Welcome to the game 'Guess the number'! What's your Name?";
        case "Hello":
            return "Hello, ";
        case "Rules":
            return " read the Rules of the Game: The player must guess the number given by the computer. Attempts are limited. (The range of numbers and the number of attempts is entered by the player at the beginning of the game). ";
        case "PlayOrNo":
            return "Do You want to play Game? (press 'Y' for yes or any key for end)";
        case "requestNumber":
            return "You have entered something wrong, try one more.";
        case "Attempts":
            return " Enter the number of attempts for which you will guess the hidden number! ";
        case "MinBound":
            return " enter the Min bound > 0'! ";
        case "MaxBound":
            return " enter the Max bound > 0! ";
        case "Max>Min":
            return "MaxBound must be greater than MinBound";
        case "I guess a Number!":
            return " I guess a Number! ";
        case "userNumber":
            return " enter Your Number! You have attempts left - ";
        case "Attempts=0":
            return "Your attempts have ended, you have failed! I thought of a number - ";
        case "Winner":
            return "You are a winner!! You guessed the hidden number - ";
        case "greater":
            return "Your Number greater than My Number!";
        case "less":
            return "Your Number less than My Number!";
        default:
            return "";
    }
} 

(int, int) initGame (string playerName)
{
    int minBound = requestNumber(playerName + getGameMessages("MinBound"));
    int maxBound = 0;
    while (true)
    {
        maxBound = requestNumber(playerName + getGameMessages("MaxBound"));
        if (maxBound <= minBound) Console.WriteLine(getGameMessages("Max>Min"));
        else break;
    }
    return (createNumber(minBound, maxBound), requestNumber(playerName + getGameMessages("Attempts")));
}

int createNumber(int minBound, int maxBound)
{
    Random r = new Random();
    return r.Next(minBound, maxBound);
}

int makeMove(int arg, string name)
{
    return (requestNumber(name + "!" + getGameMessages("userNumber") + arg + ": "));
}

bool checkNumber(int userNumber, int secretNumber)
{
    return userNumber == secretNumber;
}

string gameOver(int arg)
{
    switch (arg)
    {
        case 0:
            return (getGameMessages("Winner") + secretNumber);
        case 1:
            return (getGameMessages("Attempts=0") + secretNumber);
        default:
            return "";
    }
}