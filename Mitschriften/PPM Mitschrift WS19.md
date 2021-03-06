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

## SCOR (10/15/19)

Slides:
- Procurement 6 (from page 15)
- Procurement 7

Topics:
- Pull / Push
- Kanban
- SCOR 
- Just in Time
- Inventory planning

**Exam:** Why do we need SCOR? Explain!

## Production 1 (10/21/19)

Types of production
Throughput time
[CONWIP](https://www.allaboutlean.com/conwip-comparison/) System - Constant Work In Progress

DIO : Days Inventory Outstanding
DSO : Days Sales Outstanding
DPO : Days Payables Outstanding

Cash Conversion : DIO + DSO - DPO

**Production 2**

Poka Yoke (Toyota) : "Mistake proofing"

5S - Efficient workspace organization
- Sort
- Set in Order
- Shine
- Standardize
- Sustain

## Production 3 (10/22/19)

Lead time : Order to Delivery
Throughput time : Pass-thru time in manufactoring, raw to finish
Takt time : The rate at which you need to finish a product to meet customer demand

Takt = Total available productive time &divide; Average customer demand

Line balancing : Matching production time with takt time
In case they don't match - remove bottlenecks or excess capacity

MBWA : Management by walking around (HP)

SMED : Single-Minute Exchange of Dies (-> Quick Changeover, *"Rüstzeit"*)

SMED : External - process is running, Internal - process stopped - `projekte/fom/ppm/smed.pptx`

To optimize, make as many activities external as possible; shorten the internal elements; shorten the external elements 

Kai Zen : "Change Good" : Continuous Improvement

Visual Management : Visualize information

*"Lot size 1 production"*

## Standard Operating Procedure (11/4/19)

SOP:
- Set of written instructions
- For repetitive action
- Across place (e.g. branches) and time (e.g. today, tomorrow)
- Should have a clear goal
- Cater to the intended audience
- Be clear and unambiguous

**Profit maximization**

Fixed costs vs. variable costs

Long-term: All costs are variable.

*The law of diminishing marginal return*

Marginal cost (MC): The cost of making one more unit
- MC = Change in total cost &divide; Change in quantity

Marginal revenue (MR): The revenue of selling on more unit

[Profit maximization Rule](https://www.intelligenteconomist.com/profit-maximization-rule/): MC == MR
- If MR > MC, increase output
- If MR < MC, decrease output

**Activity based costing**

Direct costs: Easily attributed to a service / product
Indirect costs: Can't easily be attributed to a service / project. "Overhead"

Traditionally, indirect costs would be allocated using labor or machine hours

Activity based costing is now used to allocate the actual overhead costs per unit

## Segmentation (11/12/19)

Missing - "psychographic segmentation"

## Targeting (11/18/19)

STP Model:
- Segmentation
- Targeting
- Positioning

**Exam:** Pick one of the theories of the marketing course and compare how the theory applies to your employer (approx. 100 words) - *Transferaufgabe*

Operational marketing: Short-term, generating sales
Strategic marketing: Long-term, performed by senior management

4P Marketing Mix:
- Product : Define your product and USP
- Price : Linked to perceived value
- Place : Where to buy? (Direct / Indirect), distribution
- Promotion : Communication, advertising, PR

Brand extension: Connection between different product families (e.g. Apple: Smartphones -> Wearables)

Diffusion of innovation:
- Innovators, early adopters, early majority, late majority, laggards

Product lifecycle:
- Introduction (launch) - growth - maturity - decline (saturation)
- Audience: Early adopters - broader audience - emphasis on product differentiation - harvest

## Pricing (11/26/19)

Pricing strategies:
- Stamps
- McDonald's menu (meal deal)
- Louis Vuitton
- 1-Euro shops
- Aldi

Pricing policies:
- Cost-based pricing
- Value-based pricing
	- Based on perceived value
	- Market research / strong advertising
- Premium pricing
- Uniform pricing
	- Average price / simple
- Single-price policy
- Price discrimination
- Psychological pricing
	- ".99" is less than "1" 
	- Also called "charm pricing"
- Pricing for market penetration
- Economic pricing
	- Needs volume
- Anchored pricing
	- Establish a higher price, than discount for volume
- Price skimming
- Bundle pricing
- "Buy one, get one free" (Bogof)
	- Greed is a major motivator

**Exam:** Name a number of pricing policies

**Exam:** [Purchase Funnel:](https://www.business-to-you.com/marketing-funnel/)
- Awareness
- Interest
- Purchase
- ...
- Loyalty
- Advocacy

Advertising / Public Relations
- Paid / not paid
- Full message control / free
- Easy to target / more credible, more believable

*"Purchase does not always follow decision"*

After-Sales services:
- Warranty
- Customer support
- Exchange
- Listening to customer complaints
- Ask for feedback
- Advice on using the product

Innovative Loyalty programs:
- [Sephora Beauty Insider](https://www.sephora.com/profile/beautyInsider/)
	- "Welcome to the club! Beauty Insider is your fast track to a never-ending supply of beauty rewards. It's free to join, and every dollar spent earns a point that gets you closer to your next beauty fix."

## Marketing (12/2/19)

(4P) Place:
- Direct ("Full control over user experience")
- Indirect
	- Wholesale / Retail

Intermediaries:
- Agents
- Wholesale
- Distributor
- Retail
- Internet / e-Commerce

Intensive distribution:
- Multiple outlets
- Products for everyday use

Selective distribution:
- Few, selected outlets

Exclusive distribution:
- Complete control, 1:1 relationship

Example distribution models: Avon, Tesla, Apple, Dell (old)

**Exam:** [BGC Growth-Share Matrix](https://strategicmanagementinsight.com/tools/bcg-matrix-growth-share.html)

**Exam:** Ansoff Model - Using the [Ansoff Markets-Products Matrix](https://www.smartinsights.com/marketing-planning/create-a-marketing-plan/ansoff-model/) to identify growth opportunities


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTg2MzM1NTcwNywxMDUxMjgwMzkzLDE5MT
E3MzY3MDksLTEwNTgxMTE3OSwtMTI2NTA1MjE1LC0xNDc0OTg3
MDczLC0zNjMxNTA0OTksMTYxNDY2MDkwOCwxMjM3MjIxMzMyLC
02ODc4OTA4MTcsLTE4OTIwMjY3MjksMTczNTA4MTc4Niw1MDA2
NzY3NjcsMTUyNTc1NTczNiwtMTM4MjQ4NjMyMiw3MzA5OTgxMT
ZdfQ==
-->