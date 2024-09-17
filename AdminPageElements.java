package com.collaborator.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AdminPageElements {
    public SelenideElement repositoryHostingServicesLink() {
        return $("a[href*=RepositoryHostingServices]");
    }

    public SelenideElement adminTemplateLink() {
        return $("a[href*=AdminTemplates]");
		System.out.println("Hello Visual Studiot");
    }

    public SelenideElement externalURL() {
        return $("#base-url");
    }

    public SelenideElement saveSystemSettings() {
        return $x("//table[@id='SettingsTable']//input[@name='buttonSubmit']");
    }

    public SelenideElement rolesLink() {
        return $x("//a[text()='—  Roles']");
    }

    public SelenideElement automaticLink() {
        return $x("//a[contains(@href,'AdminAutomaticLinks')]");
    }

    public SelenideElement additionalLoginOptionsLink() {
        return $x("//a[contains(@href,'AdminRemoteLogin')]");
    }

    public SelenideElement usersLink() {
        return $x("//a[contains(@href,'AdminUsers')]");
    }

    public SelenideElement licensingLink() {
        return $x("//a[contains(@href,'AdminLicensing')]");
    }

    public SelenideElement issueTrackingServicesLink() {
        return $x("//a[contains(@href,'AdminIssueTrackingServices')]");
    }

    public SelenideElement systemStatusPageLink() {
        return $x("//a[contains(@href,'AdminStatus')]");
    }
}