# Simple Blockchain in Java

This project is a basic implementation of a blockchain written in Java.  
It demonstrates core blockchain concepts such as:

- Creating blocks with data and linking them via hashes
- Mining blocks by solving Proof of Work puzzles (finding a hash with leading zeros)
- Validating the blockchain integrity by checking hashes and links

## Features

- Block mining with adjustable difficulty
- Chain validation to ensure blocks are not tampered with
- Simple console output showing mining process and blockchain data in JSON format

## How to Run

1. Clone the repository  
2. Compile and run the `NoobChaine` class  
3. Watch the blocks being mined and printed in the console

## Why this project?

This is an educational tool to help understand how blockchains work under the hood, especially concepts like:

- Hash linking
- Proof of Work (PoW)
- Data immutability
## Dependencies

## Dependencies

- This project uses the [Gson](https://github.com/google/gson) library to convert the blockchain data into a nicely formatted JSON string for display.
- If you don’t want to use Gson, you can remove the related code that converts the blockchain to JSON and instead print the blocks manually.
- To use Gson, download the `gson-<version>.jar` file and add it to your classpath when compiling and running.





Created by Achraf Bouiguigne
