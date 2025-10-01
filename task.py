import sys


def main():
    p = float(sys.stdin.read().strip())
    result = 1.0 / (p * p * (1 - p))
    print(f"{result:.4f}")

if __name__ == '__main__':
    import sys
    main()