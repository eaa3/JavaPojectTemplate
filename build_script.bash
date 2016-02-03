
# collects .java source files and saves the list of paths to them in source.txt
find . -name "*.java" > source.txt

# if the build directory doesn't exist, then we create it
if [ ! -d build ]; then
  echo "creating build folder..."
  mkdir build
fi

echo "building..."
javac -d build @source.txt