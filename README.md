## Benford's Law

Benford’s law is an observation about the frequency distribution of leading digits in many real-life sets of numerical data. The law states that in many naturally occurring collections of numbers, the leading significant digit is likely to be small. For example, in sets that obey the law, the number 1 appears as the most significant digit about 30% of the time, while 9 appears as the most significant digit less than 5% of the time. By contrast, if the digits were distributed uniformly, they would each occur about 11.1% of the time. [Wikipedia](https://en.wikipedia.org/wiki/Benford%27s_law)

Here are few more interesting instances where Benford’s law has been used:

- Benford’s Law was invoked as evidence of fraud in the 2009 Iranian elections.
- The macroeconomic data the Greek government reported to the European Union before entering the eurozone was shown to be probably fraudulent using Benford’s law.
- One researcher even applied the law to thirteen years of Bill Clinton’s tax returns. He passed.

In this repository, I've included the code to run the Benford's analysis on an annual report of Indian Listed Company.

![Result of Benford's analysis of Reliance Comm Annual Report](https://user-images.githubusercontent.com/26899066/76157017-0f82b880-6129-11ea-80e6-3495e3e596f6.png)

## Disclaimer

This was a quick and sloppy experiment. Ideally, I should have scrubbed the numerical data before running my analysis, i.e., I should have filtered out the numbers which were not really financial data like the page numbers, section numbers, etc. I didn’t do all that.

So please don’t rely on these results. It was an experiment more for fun rather than investigation.
