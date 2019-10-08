# Procurement, Production & Marketing (9/9/19)

Keith Welch
keithjwelch@hotmail.com

Exam: 90 minutes, 10% practical task given beforehand
Example: "Which theory of the marketing module does you company use (or not)?"

Procurement:
- Buying process
- Supplier management
- Requirements management

Steps:
- Needs recognition
- Purchase requisition
- Review of requests
- Negotiation of contract
- Quotation request
- Budget approval
- Receive goods / services
- Three-way matching
	- Purchase order
	- Packing slip
	- Invoice
- Invoice approval and payment
- Record keeping

Centralized vs decentralized procurement:
- flexibility vs purchasing power
- enforcing standards and compliance
- specialization
- duplication

[Pareto principle](https://www.investopedia.com/terms/p/paretoprinciple.asp): 

> The Pareto Principle, named after esteemed economist Vilfredo Pareto,
> specifies that 80% of consequences come from 20% of the causes,
> asserting an unequal relationship between inputs and outputs. This
> principle serves as a general reminder that the relationship between
> inputs and outputs is not balanced. The Pareto Principle is also known
> as the Pareto Rule or the 80/20 Rule.

 - Law of the virtual few 
 - Principle of factor sparsity 
 - Law of diminishing return

## ABC-XYZ (9/16/09)

**ABC Analysis**

Split stock by value (i.e. percentage of value = cost * quantity):
- A: Most value (70%-80%)
- B: Less value (15%-20%)
- C: Least value (5%-15%)

**XYZ Analysis**

Split stock by usage:
- X: Most used / little variation in demand over time
- Y: Less used / some variation in demand 
- Z: Least used / most variable demand

Forecasting: "Knowing when you need it"

ABX-XYZ Analysis:
- High / Medium / Low value goods
- Steady / Fluctuating / No trend demand

AX: automated, low, continuous
CX: automated, low, continuous / periodic
AZ: buy to order, no buffer, periodic - no tracking
CZ: automatic / manual, low, periodic

**Exam:** "Explain the difference between AX and CZ, explain the characteristics and the different replenishment strategies"

**Forecasting methods:**
- Exponential smoothing
- Moving averages
- Regression analysis

[Exponential smoothing](https://www.statisticshowto.datasciencecentral.com/exponential-smoothing/)
F<sub>t+1</sub> = F<sub>t</sub> + &alpha;(A<sub>t</sub> - F<sub>t</sub>)
F : Forecast
A : Actual, over two time periods, e.g. "yesterday" and "today"
&alpha; : Smoothing constant (0..1) - the lower &alpha; is, the more smoothing occurs
Start at the second data point, i.e. F<sub>t</sub> = A<sub>t-1</sub>

[Moving average](https://www.investopedia.com/terms/m/movingaverage.asp)
Calculate the average, e.g. for the last six months (hence: moving)
Weighted moving average: Add weights to each of the last six items, instead of using 16.6%

[Regression analysis](https://towardsdatascience.com/linear-regression-detailed-view-ea73175f6e86)
Linear regression: Relation between ice cream sales and temperature
Independent value: Temperature: x
Dependent value: Ice cream sales: y

*Least square regression line - Minimize the sum of the squares of the errors*

b = &sum;((x - $\bar x$) &times; (y - $\bar y$)) &divide; &sum;((x - $\bar x$)^2^

$\bar y$ = a + b$\bar x$

Final formula: y = a + bx (a is the value of y when x=0; b is the gradient)

## Supply Market Analysis (9/17/19)

[Porter's Five Forces](https://thecimastudent.com/2016/10/14/cima-e2-porters-five-forces/)
- Profitability

[PESTEL analysis](https://www.business-to-you.com/scanning-the-environment-pestel-analysis/) (**P**olicital, **E**nvironmental, **S**ocial, **T**echnology, **E**conomical, **L**aw)
- Environmental factors

## Bill of Materials (9/24/19)

- Single level
- Multi level
	- combines single-level BoMs
	- shows units of assembly
- Flattened
	- excludes assembly information

**Material Requirements Planning**
- Gross requirements: Items we need
- On hand: Items we have
- Safety stock: Minimum number of items we need to have
- Scheduled receipts: Items we've ordered, but not yet received
- Planned order release: Time when we will place order for new items
- Lot size: Number of items that need to be bought together

## Economic Order Quantity (9/20/19)

*"The amount a company should order to minimize cost"*

Costs to be avoided:
- Holding costs
- Order costs
- Shortage costs

EOQ model assumptions:
- Fixed quantity ordered
- Consistent demand
- Inventory depleted at a constant rate
- Instant replenishment

Total cost = (P &times; D) + (Q/2 &times; H) + (D/Q &times; S)

P: Price; D: Demand; Q: Units ordered; H: Holding costs *per item*; S: Ordering costs *per order*

Tradeoff between Inventory and ordering costs - ideal order quantity is reached when the cost of inventory is equal to the cost of ordering.

**EOQ Formula** Q: &radic;(2DS &divide; H)

## Reorder Point (10/8/18)

Lead time: The time period from placing the order to receiving the goods

Safety Stock: (MaxDailyUse &times; MaxLeadTime) - (AvgDailyUse &times; AvgLeadTime)

Reorder Point: (AvgLeadTime &times; AvgDailyUsage) + SafetyStock

**Exam:** Explain EOQ, Safety Stock and Reorder Point

Make or Buy quantity break even analysis:

Q = FixCosts &divide; ( buyingPrice - makingPrice)

**Exam:** [Bullwhip effect](https://blog.arkieva.com/what-is-bullwhip-effect/)

Lean: Develop efficient processes with zero waste

TIM WOOD:
- Transportation
- Inventory
- Motion
- Waiting
- Overprocessing
- Overproduction
- Defects

*"Fashion is just a way to sell more clothes that you don't need"*


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE4OTIwMjY3MjksMTczNTA4MTc4Niw1MD
A2NzY3NjcsMTUyNTc1NTczNiwtMTM4MjQ4NjMyMiw3MzA5OTgx
MTZdfQ==
-->