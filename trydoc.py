import sys

def main():

  print(len(sys.argv))

  if len(sys.argv) < 2:
     print("Python Not Enough Arguments")
     sys.exit()

  print("Hi There - {}".format(sys.argv[1]))


if __name__ == "__main__":
  main()
