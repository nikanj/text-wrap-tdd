### The Word Wrap Kata
	Create a function which breaks words on specified space with new line. Its nothing but merely similar to word-processor.

#### Rules:
		1. When word ends at specified position then put line break there
			e.g. character_count = 5 -> lorem => lorem\n
		2. When word is shorter than specified position then break at whitespace
			e.g. character_count = 5 -> ip sums => ip\nsums
		3. When word is longer than specified character count then break word
			e.g. character_count = 3 -> lorem => lor\nem