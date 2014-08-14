
using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;


using Crit.Semantics.Generated.Txtf1.Fieldreports.EmergentEvent;
using Crit.Semantics.Generated.Txtf1.Fieldreports.Spotrep;
using Ecologylab.Semantics.Generated.Library.AcmNS;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.Generated.Library.AskNatureNS;
using Ecologylab.Semantics.Generated.Library.BibManagingNS;
using Ecologylab.Semantics.Generated.Library.BlogNS;
using Ecologylab.Semantics.Generated.Library.BoardGameNS;
using Ecologylab.Semantics.Generated.Library.CameraNS;
using Ecologylab.Semantics.Generated.Library.CartoonNS;
using Ecologylab.Semantics.Generated.Library.CiteulikeNS;
using Ecologylab.Semantics.Generated.Library.ClothingNS;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.DisasterNS;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.Generated.Library.DreamHouseNS;
using Ecologylab.Semantics.Generated.Library.FashionNS;
using Ecologylab.Semantics.Generated.Library.FastflipNS;
using Ecologylab.Semantics.Generated.Library.FlickrNS;
using Ecologylab.Semantics.Generated.Library.GisNS;
using Ecologylab.Semantics.Generated.Library.GoogleBookNS;
using Ecologylab.Semantics.Generated.Library.GoogleScholarNS;
using Ecologylab.Semantics.Generated.Library.GrantNS;
using Ecologylab.Semantics.Generated.Library.HotelNS;
using Ecologylab.Semantics.Generated.Library.IcdlNS;
using Ecologylab.Semantics.Generated.Library.IeeeXploreNS;
using Ecologylab.Semantics.Generated.Library.ImdbNS;
using Ecologylab.Semantics.Generated.Library.InstructablesNS;
using Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS;
using Ecologylab.Semantics.Generated.Library.LolzNS;
using Ecologylab.Semantics.Generated.Library.MiscNS;
using Ecologylab.Semantics.Generated.Library.MovieNS;
using Ecologylab.Semantics.Generated.Library.MuseumNS;
using Ecologylab.Semantics.Generated.Library.NewsNS;
using Ecologylab.Semantics.Generated.Library.NsdlNS;
using Ecologylab.Semantics.Generated.Library.NsfNS;
using Ecologylab.Semantics.Generated.Library.OpenDNS;
using Ecologylab.Semantics.Generated.Library.OpmlNS;
using Ecologylab.Semantics.Generated.Library.PatentNS;
using Ecologylab.Semantics.Generated.Library.PersonNS;
using Ecologylab.Semantics.Generated.Library.PinterestNS;
using Ecologylab.Semantics.Generated.Library.PrimitivesNS;
using Ecologylab.Semantics.Generated.Library.ProductAndServiceNS;
using Ecologylab.Semantics.Generated.Library.PublicationNS;
using Ecologylab.Semantics.Generated.Library.PubmedNS;
using Ecologylab.Semantics.Generated.Library.ResearchGateNS;
using Ecologylab.Semantics.Generated.Library.RestaurantNS;
using Ecologylab.Semantics.Generated.Library.ReviewNS;
using Ecologylab.Semantics.Generated.Library.RssNS;
using Ecologylab.Semantics.Generated.Library.RwandatribunalNS;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.Semantics.Generated.Library.ScienceDirectNS;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.Generated.Library.SlashdotNS;
using Ecologylab.Semantics.Generated.Library.SocialMediaNS;
using Ecologylab.Semantics.Generated.Library.TravelNS;
using Ecologylab.Semantics.Generated.Library.TripAdvisorNS;
using Ecologylab.Semantics.Generated.Library.TumblrNS;
using Ecologylab.Semantics.Generated.Library.TvShowNS;
using Ecologylab.Semantics.Generated.Library.TvtropesNS;
using Ecologylab.Semantics.Generated.Library.UrbanspoonNS;
using Ecologylab.Semantics.Generated.Library.UvaNS;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.Generated.Library.WikipediaNS;
using Ecologylab.Semantics.Generated.Library.YelpNS;
using Ecologylab.Semantics.Test.Library.Generics;

// Developer should proof-read this TranslationScope before using it for production.
namespace Ecologylab.Semantics.Generated.Library 
{
	public class RepositoryMetadataTranslationScope
	{
		public RepositoryMetadataTranslationScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("repository_metadata", MetadataBuiltinsTypesScope.Get(),
				typeof(AcmPortal),
				typeof(AcmPortalAuthor),
				typeof(AcmPortalAuthorCollaborators),
				typeof(AcmPortalAuthorPublicationDetail),
				typeof(AcmPortalInstitutionProfile),
				typeof(AcmPortalPeriodical),
				typeof(AcmPortalSearch),
				typeof(AcmPortalSearchResult),
				typeof(AdditionalMetadata),
				typeof(AmazonBook),
				typeof(AmazonList),
				typeof(AmazonProduct),
				typeof(AnandtechReview),
				typeof(Anthropologie),
				typeof(AppleIProduct),
				typeof(AppleProductAccessory),
				typeof(AppleProductMac),
				typeof(Artist),
				typeof(Artwork),
				typeof(AskNatureExpert),
				typeof(AskNatureFunction),
				typeof(AskNatureGroup),
				typeof(AskNatureImage),
				typeof(AskNatureOrganism),
				typeof(AskNatureProduct),
				typeof(AskNatureStrategy),
				typeof(AskNatureSubgroup),
				typeof(AskNatureTaxonomy),
				typeof(Asos),
				typeof(AsosPage),
				typeof(Attraction),
				typeof(AttractionList),
				typeof(Audience),
				typeof(AudioClipping),
				typeof(AudioSelfmade),
				typeof(Author),
				typeof(BasicPublication),
				typeof(BedbathandbeyondMobileProduct),
				typeof(BedbathandbeyondProduct),
				typeof(BestbuyProduct),
				typeof(BggCategory),
				typeof(BggGame),
				typeof(BingSearchApi),
				typeof(BingSearchXpath),
				typeof(BirthDetail),
				typeof(Blog),
				typeof(BoardGame),
				typeof(Body),
				typeof(Book),
				typeof(Bookmark),
				typeof(BritishCartoonArchive),
				typeof(CachedHtml),
				typeof(CameraSettings),
				typeof(Cartoon),
				typeof(CategoryInterviews),
				typeof(Cb2Product),
				typeof(Channel),
				typeof(CitationInfo),
				typeof(CiteseerxCiting),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSearch),
				typeof(CiteseerxSimilar),
				typeof(CiteseerxSummary),
				typeof(CiteulikeAuthor),
				typeof(CiteulikePaper),
				typeof(CiteulikeSearch),
				typeof(CiteulikeTag),
				typeof(CiteulikeUser),
				typeof(CnetReview),
				typeof(Collection),
				typeof(Comment),
				typeof(Commodity),
				typeof(ContactPoint),
				typeof(Contributor),
				typeof(CrateandbarrelProduct),
				typeof(CreativeWork),
				typeof(Curation),
				typeof(DateInfo),
				typeof(Dc),
				typeof(DcDocument),
				typeof(DeliciousHomepage),
				typeof(DeliciousSearch),
				typeof(Designer),
				typeof(Disaster),
				typeof(DleseGetRecord),
				typeof(DleseRecord),
				typeof(DleseRecord1),
				typeof(DleseRecord2),
				typeof(DleseRecordHead),
				typeof(DleseUserSearch),
				typeof(Dlms),
				typeof(DocumentSet),
				typeof(Earthquake),
				typeof(EbayProduct),
				typeof(Educational),
				typeof(EmergentEvent),
				typeof(EmergentEventCollection),
				typeof(EtsyProduct),
				typeof(Event),
				typeof(Exhibition),
				typeof(FashionReviewer),
				typeof(FastflipSearch),
				typeof(FlamencoFacet),
				typeof(FlamencoObject),
				typeof(FlickrAuthor),
				typeof(FlickrPhoto),
				typeof(FlickrTag),
				typeof(FondationArticle),
				typeof(FondationCategoryCollection),
				typeof(FondationCollection),
				typeof(FondationTag),
				typeof(Forever21),
				typeof(GaurdianComic),
				typeof(General),
				typeof(GeneralSearch<>),
				typeof(GetRecordAdditionalMetadata),
				typeof(GettyArtist),
				typeof(GettyArtistInfo),
				typeof(GettyCollection),
				typeof(GettyExploration),
				typeof(GettyObject),
				typeof(GettySearch),
				typeof(GettyWorkInfo),
				typeof(GisLocation),
				typeof(GlobeCartoon),
				typeof(GoogleBook),
				typeof(GooglePatent),
				typeof(GooglePatentAuthor),
				typeof(GoogleScholarArticle),
				typeof(GoogleScholarArticleFacts),
				typeof(GoogleScholarAuthor),
				typeof(GoogleScholarSearch),
				typeof(GoogleScholarSearchResult),
				typeof(GoogleSearch),
				typeof(GoogleSorry),
				typeof(Grant),
				typeof(GrantProgram),
				typeof(GrantStaff),
				typeof(GuggenArtwork),
				typeof(GuggenFilter),
				typeof(Head),
				typeof(Head1),
				typeof(Head2),
				typeof(Header),
				typeof(HmProduct),
				typeof(HomeDepotProduct),
				typeof(Hotel),
				typeof(HouzzProduct),
				typeof(IcdlBook),
				typeof(IcdlBookPreview),
				typeof(IcdlImage),
				typeof(IcdlImageResult),
				typeof(Icsmd),
				typeof(IeeeArticleBody),
				typeof(IeeeAuthorPage),
				typeof(IeeeJournalPage),
				typeof(IeeeKeywords),
				typeof(IeeeXploreArticle),
				typeof(IeeeXploreCitedBy),
				typeof(IeeeXploreReferences),
				typeof(IeeeXploreSearch),
				typeof(IkeaDepartment),
				typeof(IkeaMobileProduct),
				typeof(IkeaProduct),
				typeof(ImageSearch),
				typeof(ImageSearchResult),
				typeof(ImdbMovie),
				typeof(ImdbPerson),
				typeof(InformaWorld),
				typeof(InformationCompositionMedia),
				typeof(Instructable),
				typeof(InstructableAuthor),
				typeof(InstructableComment),
				typeof(InstructableTag),
				typeof(Investigator<>),
				typeof(Item),
				typeof(ItemRecord),
				typeof(KeywordSet),
				typeof(LandofnodProduct),
				typeof(LeagueAbility),
				typeof(LeagueChampion),
				typeof(LeagueRelationshipList),
				typeof(Lifecycle),
				typeof(Lolz),
				typeof(LowesProduct),
				typeof(MacheClipping),
				typeof(MediaContent),
				typeof(MediaProvider),
				typeof(MetArtwork),
				typeof(MetFilter),
				typeof(MmArtwork),
				typeof(Modcloth),
				typeof(ModclothSearch),
				typeof(MomaArtist),
				typeof(MomaArtwork),
				typeof(Movie),
				typeof(MoviePerson),
				typeof(NetflixMovie),
				typeof(NeweggProduct),
				typeof(NeweggSubcategoryList),
				typeof(NewmuseumArtist),
				typeof(NewmuseumArtwork),
				typeof(NewmuseumExhibition),
				typeof(NewmuseumFilter),
				typeof(NewsArticle),
				typeof(Nsdl),
				typeof(NsdlDocument),
				typeof(NsdlService),
				typeof(NsfAward),
				typeof(NsfDivision),
				typeof(NsfDivisionStaffList),
				typeof(NsfInvestigator),
				typeof(NsfProgram),
				typeof(NsfProgramStaffList),
				typeof(NsfSearch),
				typeof(NsfStaff),
				typeof(Nytimes),
				typeof(OnekingslaneProduct),
				typeof(OpenDNSDomain),
				typeof(Opml),
				typeof(Organization),
				typeof(Outline),
				typeof(OverstockComProduct),
				typeof(Paragraph),
				typeof(Patent),
				typeof(PatentAuthor),
				typeof(PatentClassification),
				typeof(PdfMixin),
				typeof(Periodical),
				typeof(Person),
				typeof(PersonnelInterview),
				typeof(Photostream),
				typeof(PieroneProduct),
				typeof(PinterestPin),
				typeof(PoliticalCartoon),
				typeof(Post),
				typeof(PostalAddress),
				typeof(PotterybarnProduct),
				typeof(Product),
				typeof(ProductSpecs),
				typeof(Publication),
				typeof(Publisher),
				typeof(PubmedArticle),
				typeof(PubmedAuthor),
				typeof(PubmedJournal),
				typeof(Rating),
				typeof(RecordMetaMetadata),
				typeof(RecordMetadata),
				typeof(ResearchGateArticle),
				typeof(ResearchGateArticleStats),
				typeof(ResearchGateAuthor),
				typeof(ResearchGateInstitution),
				typeof(ResearchGateInstitutionContactInfo),
				typeof(ResearchGateInstitutionDepartment),
				typeof(ResearchGateResearcher),
				typeof(ResearchGateResult),
				typeof(ResearchGateSearch),
				typeof(ResearchGateStats),
				typeof(Restaurant),
				typeof(RestaurantGenre),
				typeof(RestorationhardwareProduct),
				typeof(ResultInfo),
				typeof(Review),
				typeof(RhizomeArtist),
				typeof(RhizomeArtwork),
				typeof(RhizomeCollection),
				typeof(RhizomeTag),
				typeof(RoomandboardProduct),
				typeof(RottenMovie),
				typeof(RottenPerson),
				typeof(Rss),
				typeof(Rss22),
				typeof(SamsclubProduct),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(ScopusArticle),
				typeof(ScopusAuthor),
				typeof(ScopusSearch),
				typeof(Search<>),
				typeof(SearchAdditionalMetadataAdn),
				typeof(SearchCrumb),
				typeof(SearchResult),
				typeof(SearchResults),
				typeof(SearchSection),
				typeof(Section),
				typeof(Sections),
				typeof(Service),
				typeof(SfuCartoonArchive),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(SlashdotSearch),
				typeof(SocialMediaSearchOne),
				typeof(SocialMediaSearchResult),
				typeof(SocialMediaSearchResultForTest),
				typeof(SocialMediaSearchTwo<>),
				typeof(SocialVideo),
				typeof(Specification),
				typeof(Spotrep),
				typeof(Subject),
				typeof(TargetProduct),
				typeof(TateArtist),
				typeof(TateArtwork),
				typeof(TateFilter),
				typeof(TechReview),
				typeof(TempFieldValueHolder),
				typeof(TermType),
				typeof(Thumbnail),
				typeof(TigerdirectProduct),
				typeof(Topic),
				typeof(TopicCluster),
				typeof(TribunalVoices),
				typeof(TripAdvisorThingsToDo),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(Tumblr),
				typeof(TumblrSearch),
				typeof(TvShow),
				typeof(TvShowEpisode),
				typeof(Tvtrope),
				typeof(TvtropeExample),
				typeof(TvtropeFolder),
				typeof(Tweet),
				typeof(Tweeter),
				typeof(TwitterMicroblog),
				typeof(TwitterSearchResults),
				typeof(UniqloProduct),
				typeof(UrbanSpoonRestaurant),
				typeof(UserSearchAdditionalMetadata),
				typeof(UvaModel),
				typeof(VideoClipping),
				typeof(VideoInterview),
				typeof(VideoSelfmade),
				typeof(WalmartProduct),
				typeof(WayfairProduct),
				typeof(WeatherReport),
				typeof(WebVideo),
				typeof(WestelmProduct),
				typeof(WhitneyArtwork),
				typeof(WhitneyDecade),
				typeof(WhitneySearch),
				typeof(WhitneyWatchAndListen),
				typeof(WikiSearch),
				typeof(WikipediaCategoryType),
				typeof(WikipediaForTest),
				typeof(WikipediaMobilePage),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
				typeof(WorldmarketProduct),
				typeof(YahooGeoCode),
				typeof(YahooGeoCodeResult),
				typeof(YahooMediaRss),
				typeof(YahooResult),
				typeof(YahooResultSet),
				typeof(YahooThumbnail),
				typeof(YelpBusiness),
				typeof(YoutubeChannel),
				typeof(YoutubeSearchResults),
				typeof(YoutubeVideo),
				typeof(YoutubeVideoList),
				typeof(ZaraProduct));
		}
	}
}
