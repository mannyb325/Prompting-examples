
The repo is intended to showcase best practices for Prompt Engineering.

This repo includes a skeleton setup for creating custom instructions and reusable prompt files

# Prompt Engineering Demo: Python to Java with GitHub Copilot

This demo showcases the "Good → Better → Best" approach to prompt engineering using **GitHub Copilot**.  
**Scenario:** Convert a simple Python function to Java.

You'll also see how using **Custom Instructions** in Copilot can dramatically improve its responses, making them more helpful, educational, and tailored to your needs.

---

## Repository Structure

```
Proday/
├── README.md
├── test.py
├── Custom-instructions-example/
│   └── example-custom-instructions.md
├── Prompting-exercise/
│   ├── good.md
│   ├── better.md
│   └── best.md
├── Reusableprompts/
│   └── reusable-prompt-examples.md
└── Tests/
    └── tests.md
```

## Files in This Demo

### Prompting Exercise
- [`Prompting-exercise/good.md`](Prompting-exercise/good.md): Minimal, basic prompt example
- [`Prompting-exercise/better.md`](Prompting-exercise/better.md): Improved, more specific prompt example
- [`Prompting-exercise/best.md`](Prompting-exercise/best.md): Highly detailed and context-aware prompt example, with recommended best practices

### Additional Resources
- [`Custom-instructions-example/example-custom-instructions.md`](Custom-instructions-example/example-custom-instructions.md): Illustration of how to write effective Copilot instructions, with commentary on best practices (context, intent, clarity, specificity)
- [`Tests/tests.md`](Tests/tests.md): Examples showing how to use the `/tests` command with increasing levels of detail and effectiveness
- [`Reusableprompts/reusable-prompt-examples.md`](Reusableprompts/reusable-prompt-examples.md): A collection of ready-to-use prompts for Copilot (chat, comments, or documentation), plus guidance on how to apply them for your team
- [`test.py`](test.py): Python test file for demonstration purposes

---

## Why Prompt Engineering?

Prompt engineering means crafting your prompt (the question or instruction you give to Copilot) to get the most accurate, relevant, and useful results.

- **Good prompts** get the job done, but may lack clarity or detail.
- **Better prompts** add context and constraints, leading to improved results.
- **Best prompts** specify exactly what you want, for whom, and how, producing consistent, high-quality output.

---

## Custom Instructions in Copilot

Custom Instructions let you tell Copilot about your background, preferences, and desired response style.

**Example Custom Instructions:**
- _What would you like Copilot to know about you?_  
  "I am a Python developer learning Java. Please explain code transitions and always include comments."
- _How would you like Copilot to respond?_  
  "Use simple language, add comments to all code, and give example usage."

With Custom Instructions enabled, even basic prompts generate richer, more tailored responses.

---

## How to Use This Demo

1. **Review the three prompt files:**  
   - See how each step improves the output.
2. **Try each prompt with Copilot:**  
   - Compare results with and without Custom Instructions.
3. **Explore the new resources:**  
   - Use the new example files for your own prompt engineering experiments.
   - Adapt the reusable prompts and instructions for your team's workflow.
4. **Discuss with your team or workshop:**  
   - What works best for your context?
   - How will you write prompts and set Custom Instructions in your workflow?

---
