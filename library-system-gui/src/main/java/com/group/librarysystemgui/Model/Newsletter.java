package com.group.librarysystemgui.Model;

/**
 * @Author: Jason
 */
public class Newsletter extends OnlineItem {
    // price represents the subscription price (per month)
    // some external features that are outside the scope of this course should be added here to accomodate viewing the newsletter through the external "interface"
    String owner;

    public Newsletter (String name, double price, String publisher){
        super(name, price, publisher);
        super.setType("newsletter");
    }

    public String open() {
        // This method should open up the newsletter through the associated interface.
        return """
                SKIP TO CONTENTSKIP TO SITE INDEXSection Navigation
                SEARCH
                LOG IN
                You have a preview view of this article while we are checking your access. When we have confirmed access, the full article content will load.
                An American flag is seen in the reflection of a blue car’s side mirror.\s
                Credit...Pete Kiehart for The New York Times
                Inside the Republican Attacks on Electric Vehicles
                President Biden’s new rule cutting emissions from vehicle tailpipes has deepened a partisan battle over automotive technology.
                                
                Credit...Pete Kiehart for The New York Times
                                
                Share full article
                                
                                
                924
                Coral DavenportLisa FriedmanJack Ewing
                By Coral Davenport, Lisa Friedman and Jack Ewing
                Coral Davenport and Lisa Friedman have covered climate change policy and politics and Jack Ewing has covered the automobile industry for nearly two decades.
                                
                March 21, 2024
                The electric vehicle, a breakthrough achievement in automotive technology, has driven into this year’s presidential election, inflaming partisan fights that have come to define much of American culture.
                                
                One reason is that President Biden has made electric vehicles central to his strategy to combat climate change. This week, his administration announced the most ambitious climate regulation in the nation’s history: a measure designed to accelerate a transition toward electric vehicles and away from the gasoline-powered cars that are a major cause of global warming.
                                
                The political war over electric vehicles has been fueled by an incendiary mix of issues: technological change, the future of the oil and gas industry, concerns about competition from China and the American love of motorized muscle. And in the rural reaches of America, where few public charging stations exist, the notion of an all-electric future feels fanciful — another element to the urban-rural divide that underlies the nation’s polarization.
                                
                Mr. Biden’s opponent, former President Donald J. Trump, has for months escalated attacks on electric vehicles broadly and the new regulation in particular, falsely calling the rule a ban on gasoline-powered cars and claiming electric cars will “kill” America’s auto industry. He has called them an “assassination” of jobs. He has declared that the Biden administration “ordered a hit job on Michigan manufacturing” by encouraging the sales of electric cars.
                                
                Within minutes of this week’s announcement of the new rule, similar talking points — albeit not as violent — flooded the Republican ecosystem.
                                
                """;
    }

	public void setOwner(String email) {
		// TODO Auto-generated method stub
		this.owner = email;
	}
	public String getOwner() {
		// TODO Auto-generated method stub
		return this.owner;
	}
}
