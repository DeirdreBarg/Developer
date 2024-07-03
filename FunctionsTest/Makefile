# Sets the C compiler to be used
CC=gcc

# Specifies the include path for the compiler; '-I' adds a directory where the compiler can look for header files
CFLAGS=-I/usr/local/include

# Specifies the library path for the linker; '-L' adds a directory where the linker can look for libraries
LDFLAGS=-L/usr/local/lib

# Specifies the libraries to link against; '-l' specifies the name of the library to link against (without 'lib' prefix or file extension)
LIBS=-lcs50

# Default target when 'make' is run without arguments. 'Test' is a dependency for 'all'
all: Test

# The 'Test' target. Compiles Test.c into an executable named 'Test'
# Flags breakdown:
# $(CC)    - The compiler (gcc)
# $(CFLAGS) - Compiler flags, specifies include paths
# $(LDFLAGS) - Linker flags, specifies library paths
# Test.c  - The source file to compile
# $(LIBS)  - The libraries to link against
# -o Test - Specifies the output executable's name
Test: Test.c
	$(CC) $(CFLAGS) $(LDFLAGS) Test.c $(LIBS) -o Test

# The 'run' target. Depends on 'Test', so it compiles first if needed, then runs the 'Test' executable
run: Test
	./Test
