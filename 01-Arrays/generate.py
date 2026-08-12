import os
import json

base_dir = r"P:\accenture\accenture\Accenture-Coding-Prep\01-Arrays"
os.makedirs(base_dir, exist_ok=True)

template_java = """/*
============================================================
ACCENTURE CODING PRACTICE
============================================================
Question ID   : ACC-01-{qid}
Title         : {title}
Historical Status : PRACTICE VARIANT
Reported Year(s)  : Practice
Role          : ASE
Package       : ₹4.5 LPA
Topic         : Arrays — {subtopic_name}
Difficulty    : {difficulty}
Accenture Pattern : HIGH
Source        : Custom Practice
============================================================
PROBLEM
============================================================
{problem}

============================================================
INPUT
============================================================
{input_format}

============================================================
OUTPUT
============================================================
{output_format}

============================================================
CONSTRAINTS
============================================================
{constraints}

============================================================
EXAMPLE 1
============================================================
Input:
{ex1_in}

Output: {ex1_out}

============================================================
EDGE CASES
============================================================
{edge_cases}

============================================================
YOUR TASK
============================================================
Write your Java solution below.
============================================================
*/

import java.util.*;

public class {class_name} {{

    public static void main(String[] args) throws Exception {{
        // Read input from stdin and print output
        // WRITE YOUR SOLUTION HERE
        Scanner sc = new Scanner(System.in);
        {scanner_code}
    }}
}}
"""

questions = [
    {
        "folder": "07-Frequency",
        "subtopic_name": "Frequency",
        "class_name": "Q01MostFrequentElement",
        "qid": "071",
        "title": "Most Frequent Element",
        "difficulty": "EASY",
        "problem": "Given an array of integers, find the most frequent element in it. If there are multiple elements that appear a maximum number of times, print any one of them.",
        "input_format": "The first line contains an integer n (size of the array).\nThe second line contains n space-separated integers representing the elements of the array.",
        "output_format": "Print the most frequent element.",
        "constraints": "- 1 <= n <= 10^5\n- -10^9 <= array[i] <= 10^9",
        "ex1_in": "5\n1 3 2 1 4",
        "ex1_out": "1",
        "edge_cases": "Array with all distinct elements, array with all same elements.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        // Your code here",
        "tests": [
            {"name": "Basic case", "input": "5\n1 3 2 1 4", "expected": "1"},
            {"name": "All same", "input": "3\n5 5 5", "expected": "5"},
            {"name": "Negative numbers", "input": "4\n-1 -1 2 2", "expected": "-1"},
            {"name": "Hidden edge case 1", "input": "1\n100", "expected": "100"},
            {"name": "Hidden large", "input": "6\n1 1 2 2 3 3", "expected": "1"}
        ]
    },
    {
        "folder": "07-Frequency",
        "subtopic_name": "Frequency",
        "class_name": "Q02FrequencySort",
        "qid": "072",
        "title": "Frequency Sort",
        "difficulty": "MEDIUM",
        "problem": "Sort the given array in decreasing order of frequency of elements. If two elements have the same frequency, sort them in increasing order of their values.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.",
        "output_format": "Print the sorted array as space-separated integers.",
        "constraints": "- 1 <= n <= 10^4\n- -10^5 <= array[i] <= 10^5",
        "ex1_in": "5\n2 5 2 8 5",
        "ex1_out": "2 2 5 5 8",
        "edge_cases": "All elements have frequency 1.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "5\n2 5 2 8 5", "expected": "2 2 5 5 8"},
            {"name": "All freq 1", "input": "4\n4 3 2 1", "expected": "1 2 3 4"},
            {"name": "All same", "input": "3\n7 7 7", "expected": "7 7 7"},
            {"name": "Hidden case 1", "input": "6\n1 1 1 2 2 2", "expected": "1 1 1 2 2 2"},
            {"name": "Hidden case 2", "input": "7\n3 3 4 4 4 2 2", "expected": "4 4 4 2 2 3 3"}
        ]
    },
    {
        "folder": "08-Duplicates",
        "subtopic_name": "Duplicates",
        "class_name": "Q01FindDuplicate",
        "qid": "081",
        "title": "Find Duplicate",
        "difficulty": "EASY",
        "problem": "Given an array of integers of size n, which contains elements from 0 to n-2, with exactly one element repeated. Find the duplicate element.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.",
        "output_format": "Print the duplicate integer.",
        "constraints": "- 2 <= n <= 10^5",
        "ex1_in": "5\n0 2 1 3 2",
        "ex1_out": "2",
        "edge_cases": "Minimum array size of 2.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "5\n0 2 1 3 2", "expected": "2"},
            {"name": "Small case", "input": "2\n0 0", "expected": "0"},
            {"name": "End duplicate", "input": "4\n0 1 2 2", "expected": "2"},
            {"name": "Hidden case 1", "input": "6\n4 3 2 1 0 3", "expected": "3"},
            {"name": "Hidden case 2", "input": "3\n1 1 0", "expected": "1"}
        ]
    },
    {
        "folder": "08-Duplicates",
        "subtopic_name": "Duplicates",
        "class_name": "Q02RemoveDuplicates",
        "qid": "082",
        "title": "Remove Duplicates",
        "difficulty": "MEDIUM",
        "problem": "Given a sorted array, remove the duplicates in-place such that each element appears only once and return the new length. Print the array up to the new length.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers (sorted).",
        "output_format": "Print the unique elements as space-separated integers.",
        "constraints": "- 1 <= n <= 10^5\n- -10^4 <= array[i] <= 10^4",
        "ex1_in": "5\n1 1 2 2 3",
        "ex1_out": "1 2 3",
        "edge_cases": "All elements identical, all elements distinct.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "5\n1 1 2 2 3", "expected": "1 2 3"},
            {"name": "All identical", "input": "4\n2 2 2 2", "expected": "2"},
            {"name": "All distinct", "input": "3\n1 2 3", "expected": "1 2 3"},
            {"name": "Hidden case 1", "input": "6\n-1 -1 0 0 1 2", "expected": "-1 0 1 2"},
            {"name": "Hidden case 2", "input": "1\n5", "expected": "5"}
        ]
    },
    {
        "folder": "09-Rotation",
        "subtopic_name": "Rotation",
        "class_name": "Q01LeftRotation",
        "qid": "091",
        "title": "Left Rotation",
        "difficulty": "EASY",
        "problem": "Rotate an array to the left by 1 position.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.",
        "output_format": "Print the array after 1 left rotation.",
        "constraints": "- 1 <= n <= 10^5",
        "ex1_in": "5\n1 2 3 4 5",
        "ex1_out": "2 3 4 5 1",
        "edge_cases": "n=1",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "5\n1 2 3 4 5", "expected": "2 3 4 5 1"},
            {"name": "n=1", "input": "1\n10", "expected": "10"},
            {"name": "n=2", "input": "2\n1 2", "expected": "2 1"},
            {"name": "Hidden case 1", "input": "4\n-1 -2 -3 -4", "expected": "-2 -3 -4 -1"},
            {"name": "Hidden case 2", "input": "3\n0 0 1", "expected": "0 1 0"}
        ]
    },
    {
        "folder": "09-Rotation",
        "subtopic_name": "Rotation",
        "class_name": "Q02RotateByK",
        "qid": "092",
        "title": "Rotate by K",
        "difficulty": "MEDIUM",
        "problem": "Rotate an array to the right by k positions.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.\nThe third line contains an integer k.",
        "output_format": "Print the array after right rotation.",
        "constraints": "- 1 <= n <= 10^5\n- 0 <= k <= 10^9",
        "ex1_in": "5\n1 2 3 4 5\n2",
        "ex1_out": "4 5 1 2 3",
        "edge_cases": "k > n, k = 0, k = n",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        int k = sc.nextInt();",
        "tests": [
            {"name": "Basic case", "input": "5\n1 2 3 4 5\n2", "expected": "4 5 1 2 3"},
            {"name": "k=0", "input": "3\n1 2 3\n0", "expected": "1 2 3"},
            {"name": "k>n", "input": "3\n1 2 3\n4", "expected": "3 1 2"},
            {"name": "Hidden case 1", "input": "5\n1 2 3 4 5\n5", "expected": "1 2 3 4 5"},
            {"name": "Hidden case 2", "input": "1\n100\n10", "expected": "100"}
        ]
    },
    {
        "folder": "10-Sorting",
        "subtopic_name": "Sorting",
        "class_name": "Q01BubbleSort",
        "qid": "101",
        "title": "Bubble Sort",
        "difficulty": "EASY",
        "problem": "Implement bubble sort to sort an array in ascending order.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.",
        "output_format": "Print the sorted array.",
        "constraints": "- 1 <= n <= 1000",
        "ex1_in": "5\n5 1 4 2 8",
        "ex1_out": "1 2 4 5 8",
        "edge_cases": "Already sorted, reverse sorted.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "5\n5 1 4 2 8", "expected": "1 2 4 5 8"},
            {"name": "Already sorted", "input": "4\n1 2 3 4", "expected": "1 2 3 4"},
            {"name": "Reverse sorted", "input": "3\n3 2 1", "expected": "1 2 3"},
            {"name": "Hidden case 1", "input": "6\n9 9 9 1 1 1", "expected": "1 1 1 9 9 9"},
            {"name": "Hidden case 2", "input": "2\n10 -10", "expected": "-10 10"}
        ]
    },
    {
        "folder": "10-Sorting",
        "subtopic_name": "Sorting",
        "class_name": "Q02InsertionSort",
        "qid": "102",
        "title": "Insertion Sort",
        "difficulty": "EASY",
        "problem": "Implement insertion sort to sort an array in ascending order.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.",
        "output_format": "Print the sorted array.",
        "constraints": "- 1 <= n <= 1000",
        "ex1_in": "5\n4 3 2 10 12",
        "ex1_out": "2 3 4 10 12",
        "edge_cases": "Already sorted, reverse sorted.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "5\n4 3 2 10 12", "expected": "2 3 4 10 12"},
            {"name": "Already sorted", "input": "3\n1 2 3", "expected": "1 2 3"},
            {"name": "Reverse sorted", "input": "4\n4 3 2 1", "expected": "1 2 3 4"},
            {"name": "Hidden case 1", "input": "5\n-1 -5 0 2 1", "expected": "-5 -1 0 1 2"},
            {"name": "Hidden case 2", "input": "1\n50", "expected": "50"}
        ]
    },
    {
        "folder": "11-Searching",
        "subtopic_name": "Searching",
        "class_name": "Q01LinearSearch",
        "qid": "111",
        "title": "Linear Search",
        "difficulty": "EASY",
        "problem": "Given an array of integers and a target element, find the 0-based index of the target in the array. If the target is not present, print -1.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.\nThe third line contains the target integer.",
        "output_format": "Print the index or -1.",
        "constraints": "- 1 <= n <= 10^5",
        "ex1_in": "5\n10 20 30 40 50\n30",
        "ex1_out": "2",
        "edge_cases": "Element not present, element at start/end.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        int target = sc.nextInt();",
        "tests": [
            {"name": "Basic case", "input": "5\n10 20 30 40 50\n30", "expected": "2"},
            {"name": "Not present", "input": "4\n1 2 3 4\n5", "expected": "-1"},
            {"name": "First element", "input": "3\n7 8 9\n7", "expected": "0"},
            {"name": "Hidden case 1", "input": "5\n1 1 1 1 1\n1", "expected": "0"},
            {"name": "Hidden case 2", "input": "2\n100 200\n200", "expected": "1"}
        ]
    },
    {
        "folder": "11-Searching",
        "subtopic_name": "Searching",
        "class_name": "Q02BinarySearch",
        "qid": "112",
        "title": "Binary Search",
        "difficulty": "EASY",
        "problem": "Given a sorted array of integers and a target element, find the 0-based index of the target using binary search. If not present, print -1.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated sorted integers.\nThe third line contains the target integer.",
        "output_format": "Print the index or -1.",
        "constraints": "- 1 <= n <= 10^5",
        "ex1_in": "5\n1 3 5 7 9\n5",
        "ex1_out": "2",
        "edge_cases": "Not present, one element.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        int target = sc.nextInt();",
        "tests": [
            {"name": "Basic case", "input": "5\n1 3 5 7 9\n5", "expected": "2"},
            {"name": "Not present", "input": "4\n2 4 6 8\n5", "expected": "-1"},
            {"name": "One element", "input": "1\n10\n10", "expected": "0"},
            {"name": "Hidden case 1", "input": "6\n-10 -5 0 5 10 15\n-10", "expected": "0"},
            {"name": "Hidden case 2", "input": "6\n-10 -5 0 5 10 15\n15", "expected": "5"}
        ]
    },
    {
        "folder": "12-Two-Pointers",
        "subtopic_name": "Two-Pointers",
        "class_name": "Q01PairWithSum",
        "qid": "121",
        "title": "Pair with Sum",
        "difficulty": "EASY",
        "problem": "Given a sorted array and a target sum, determine if there exists a pair of elements that sum up to the target. Print 'Yes' or 'No'.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated sorted integers.\nThe third line contains the target sum.",
        "output_format": "Print 'Yes' or 'No'.",
        "constraints": "- 2 <= n <= 10^5",
        "ex1_in": "5\n1 2 3 4 5\n9",
        "ex1_out": "Yes",
        "edge_cases": "No pair exists, negative numbers.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        int target = sc.nextInt();",
        "tests": [
            {"name": "Basic case", "input": "5\n1 2 3 4 5\n9", "expected": "Yes"},
            {"name": "No pair", "input": "4\n1 2 3 4\n10", "expected": "No"},
            {"name": "Negative numbers", "input": "5\n-3 -1 0 2 5\n2", "expected": "Yes"},
            {"name": "Hidden case 1", "input": "2\n1 1\n2", "expected": "Yes"},
            {"name": "Hidden case 2", "input": "6\n0 0 0 0 0 0\n1", "expected": "No"}
        ]
    },
    {
        "folder": "12-Two-Pointers",
        "subtopic_name": "Two-Pointers",
        "class_name": "Q02ContainerWithMostWater",
        "qid": "122",
        "title": "Container with Most Water",
        "difficulty": "MEDIUM",
        "problem": "Given an array of n non-negative integers representing heights of vertical lines. Find two lines that together with the x-axis form a container that holds the most water. Print the maximum area.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers (heights).",
        "output_format": "Print the maximum area.",
        "constraints": "- 2 <= n <= 10^5",
        "ex1_in": "4\n1 8 6 2",
        "ex1_out": "6",
        "edge_cases": "Minimum n=2.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }",
        "tests": [
            {"name": "Basic case", "input": "4\n1 8 6 2", "expected": "6"},
            {"name": "Small case", "input": "2\n1 1", "expected": "1"},
            {"name": "Decreasing", "input": "5\n5 4 3 2 1", "expected": "6"},
            {"name": "Hidden case 1", "input": "7\n2 3 4 5 18 17 6", "expected": "17"},
            {"name": "Hidden case 2", "input": "3\n10 0 10", "expected": "20"}
        ]
    },
    {
        "folder": "13-Sliding-Window",
        "subtopic_name": "Sliding-Window",
        "class_name": "Q01MaxSumSubarray",
        "qid": "131",
        "title": "Maximum Sum Subarray of Size K",
        "difficulty": "EASY",
        "problem": "Given an array of integers and a number k, find the maximum sum of a contiguous subarray of size k.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.\nThe third line contains k.",
        "output_format": "Print the maximum sum.",
        "constraints": "- 1 <= k <= n <= 10^5",
        "ex1_in": "4\n1 2 3 4\n2",
        "ex1_out": "7",
        "edge_cases": "k=n, negative elements.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        int k = sc.nextInt();",
        "tests": [
            {"name": "Basic case", "input": "4\n1 2 3 4\n2", "expected": "7"},
            {"name": "k=n", "input": "3\n1 2 3\n3", "expected": "6"},
            {"name": "Negative elements", "input": "5\n-1 -2 -3 -4 -5\n2", "expected": "-3"},
            {"name": "Hidden case 1", "input": "6\n1 5 2 3 7 1\n3", "expected": "12"},
            {"name": "Hidden case 2", "input": "4\n10 20 30 40\n1", "expected": "40"}
        ]
    },
    {
        "folder": "13-Sliding-Window",
        "subtopic_name": "Sliding-Window",
        "class_name": "Q02SmallestSubarraySum",
        "qid": "132",
        "title": "Smallest Subarray with Sum Greater Than or Equal to Target",
        "difficulty": "MEDIUM",
        "problem": "Given an array of positive integers and a target sum, find the minimal length of a contiguous subarray of which the sum is >= target. If there is no such subarray, print 0.",
        "input_format": "The first line contains an integer n.\nThe second line contains n space-separated integers.\nThe third line contains the target sum.",
        "output_format": "Print the minimal length.",
        "constraints": "- 1 <= n <= 10^5\n- 1 <= array[i] <= 10^4",
        "ex1_in": "6\n2 3 1 2 4 3\n7",
        "ex1_out": "2",
        "edge_cases": "No such subarray, 1 element satisfies.",
        "scanner_code": "if (!sc.hasNextInt()) return;\n        int n = sc.nextInt();\n        int[] arr = new int[n];\n        for (int i = 0; i < n; i++) {\n            arr[i] = sc.nextInt();\n        }\n        int target = sc.nextInt();",
        "tests": [
            {"name": "Basic case", "input": "6\n2 3 1 2 4 3\n7", "expected": "2"},
            {"name": "No such subarray", "input": "3\n1 1 1\n10", "expected": "0"},
            {"name": "One element", "input": "4\n1 4 4 1\n4", "expected": "1"},
            {"name": "Hidden case 1", "input": "8\n1 1 1 1 1 1 1 1\n8", "expected": "8"},
            {"name": "Hidden case 2", "input": "5\n1 2 3 4 5\n11", "expected": "3"}
        ]
    }
]

for q in questions:
    folder_path = os.path.join(base_dir, q["folder"])
    os.makedirs(folder_path, exist_ok=True)
    
    java_code = template_java.format(**q)
    
    test_json = {
        "question_id": f"ACC-01-{q['qid']}",
        "title": q["title"],
        "visible": q["tests"][:3],
        "hidden": q["tests"][3:]
    }
    
    java_file = os.path.join(folder_path, f"{q['class_name']}.java")
    with open(java_file, "w", encoding="utf-8") as f:
        f.write(java_code)
        
    json_file = os.path.join(folder_path, f"{q['class_name']}.tests.json")
    with open(json_file, "w", encoding="utf-8") as f:
        json.dump(test_json, f, indent=2)

print("Done")
