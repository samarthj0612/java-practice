#!/usr/bin/env bash

FILENAME="$1"

if [[ -z "$FILENAME" ]]; then
	echo "Usage: $0 <JavaFile.java>"
	exit 1
fi

echo "Compiling $FILENAME..."
javac "${FILENAME}.java"

echo -e "Running $FILENAME...\n"
java "$FILENAME"