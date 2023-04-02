@BackgroundFeature @Regression

Feature: Background color change validation 

@Scenario1
Scenario: I should be able to change the background color to sky blue by clicking the Set SkyBlue Background button
	Given Set SkyBlue Background button exists
	 When I click on the button 
	 Then The background color will change to sky blue
 
@Scenario2 
	Scenario: I should be able to change the background color to white by clicking the Set SkyWhite Background button
	Given Set SkyWhite Background button exists
	 When I click on the SkyWhite button
	 Then The background color will change to white