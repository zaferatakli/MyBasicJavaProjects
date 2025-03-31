
---

# ☕ Create a Simple Coffee Machine

## 🟢 Step 1: Ask for Coffee Type

- The system should ask: **"Which coffee would you like?"**
   - Turkish Coffee
   - Filter Coffee
   - Espresso

Create a `String` variable called `whichCoffee` and write one of the available coffee types (e.g., **"Turkish Coffee"** or **"turkish coffee"**).  
Use a `String` method to make this **case-insensitive** (not affected by uppercase/lowercase).

### ✅ TODO Condition 1:

- Create a `String` called `coffee`.
- If the selected coffee is **Turkish Coffee**, print:  
  `"Turkish Coffee is being prepared..."`  
  *(Don't just print "Turkish Coffee" – use the variable `whichCoffee`!)*
- If it's **Filter Coffee**, print:  
  `"Filter coffee is being prepared..."` *(Use `whichCoffee`)*
- If it's **Espresso**, print:  
  `"Espresso is being prepared..."` *(Use `whichCoffee`)*
- If an invalid option is entered, print:  
  `"Invalid selection. Please try again."`  
  *(Ask the same question again.)*

---

## 🟢 Step 2: Ask for Milk

- The system should ask:  
  **"Would you like us to add milk? (Please answer with Yes or No):"**  
  *(Make sure this appears exactly like this on the console.)*

- Create a `String` called `milk`.
- If the answer is **"yes"**, print:  
  `"Adding milk..."`  
  *(Should be case-insensitive – accepted answers include: Yes, YES, YeS, YEs, etc.)*
- If the answer is **"no"**, print:  
  `"No milk added."`
- If the input is invalid, ask the same question again.

---

## 🟢 Step 3: Ask for Sugar

- The system should ask:  
  **"Would you like sugar? (Please answer with Yes or No):"**

- Use `String` methods to ensure **case-insensitive** comparison.
- Create a `String` called `sugar`.
- If the answer is **"yes"**, the system should ask:  
  **"How many sugars would you like?: "**  
  Create an `int` called `howManySugar`, and store the amount.  
  Then print:  
  `"Adding 5 sugars."` *(replace with actual number)*
- If the answer is **"no"**, print:  
  `"No sugar added."`
- If the input is invalid, ask the same question again.

---

## 🟢 Step 4: Ask for Size

- The system should ask:  
  **"What size would you like? (Please enter: Large - Medium - Small): "**  
  *(Inputs like “Large” or “large” should be accepted; case-insensitive)*

- Create a `String` called `size`.

- If `size` is **"Large"**, print:  
  `"Your coffee is being prepared in large size."`  
  → Example: `"Your " + whichCoffee + " is being prepared in " + size + " size."`
- If `size` is **"Medium"**, print similarly.
- If `size` is **"Small"**, print similarly.
- For any invalid input, ask the same question again.

---

## ✅ Final Step: Show Result

We’ve placed our order. Now we want to see the result.

Print something like this in the console:  
**"Turkish Coffee, medium size, ready. Enjoy!"**

- Use the variable `whichCoffee` for the coffee type and `size` for the size.

---
