#
# https://elitedatascience.com/python-machine-learning-tutorial-scikit-learn
# https://d1p17r2m4rzlbo.cloudfront.net/wp-content/uploads/2016/03/1384367562_colors_in_9_langages.csv
#

# Import necessary modules

import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn import preprocessing
from sklearn.ensemble import RandomForestRegressor
from sklearn.pipeline import make_pipeline
from sklearn.model_selection import GridSearchCV
from sklearn.metrics import mean_squared_error, r2_score
 
# Read the data and print some stats

data = pd.read_csv('1384367562_colors_in_9_langages.csv')

print(data.describe())

# Split data into training and test

y = data.color_code
X = data.drop('color_code', axis=1)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.1, random_state=1)

# Create and cross-validate pipeline

pipeline = make_pipeline(preprocessing.StandardScaler(), RandomForestRegressor(n_estimators=100))
# hyperparameters = { 'randomforestregressor__max_features' : ['auto', 'sqrt', 'log2'], 'randomforestregressor__max_depth': [None, 5, 3, 1]}
hyperparameters = {'randomforestregressor__max_features': ['sqrt'], 'randomforestregressor__max_depth': [None]}
clf = GridSearchCV(pipeline, hyperparameters, cv=10)

# Fit model

clf.fit(X_train, y_train)

# Print suggested parameters - uncomment default above to use

# print(clf.best_params_)

# Predict new data set

y_pred = clf.predict(X_test)

# Evaluate model performance

print("\nR2 Score", r2_score(y_test, y_pred))
print("\nMean error squared", mean_squared_error(y_test, y_pred), "\n")

# Output data

try:
  fresult = open("1384367562_colors_in_9_langages.result", "w", encoding="utf-8")
except (IOError) as e:
  print("File open error", e.args[1])
  os.exit(1)

print("r", "g", "b", "color_code", "prediction", file=fresult, sep=",")
for i in range(len(X_test)):
  print(*list(X_test.iloc[i]), y_test.iloc[i], int(y_pred[i]), file=fresult, sep=",")

fresult.close()

exit()

