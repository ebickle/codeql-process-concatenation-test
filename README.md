This repository reproduces an issue with CodeQL's Java analysis.

The "Command line is built using string concatenation" CodeQL alert is generated when concatenating a `String` class directly, but is not generated when concatenating a string within a `StringBuilder` class.
