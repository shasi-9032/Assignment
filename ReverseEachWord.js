function reverseWordsInSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    return reversedWords.join(" ");
}

const input = "This is a sunny day"; // Replace with your input sentence
const reversedSentence = reverseWordsInSentence(input);
console.log("Reversed sentence:", reversedSentence);
