
using Ecologylab.BigSemantics.MetaMetadataNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins;
using Ecologylab.Collections;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;


using Ecologylab.BigSemantics.Generated.Library.CommentNS;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ProductNS;
using Ecologylab.BigSemantics.Generated.Library.CommodityNS.ServiceNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ArtworkNS.CartoonNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.BlogPostNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ExhibitionNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.PublicationNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.ScholarlyArticleNS;
using Ecologylab.BigSemantics.Generated.Library.CreativeWorkNS.TechReviewNS;
using Ecologylab.BigSemantics.Generated.Library.EventNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS;
using Ecologylab.BigSemantics.Generated.Library.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.Generated.Library.PrimitivesNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS;
using Ecologylab.BigSemantics.Generated.Library.SearchNS.ImageSearchNS;
using Ecologylab.BigSemantics.Generated.Library.WeatherReportNS;
using Ecologylab.BigSemantics.Generated.Library.WikipediaPageNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins.Declarations;
using Ecologylab.BigSemantics.MetadataNS.Builtins.Declarations.CommentNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins.Declarations.CreativeWorkNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins.Declarations.PersonNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins.Declarations.PersonNS.AuthorNS;
using Ecologylab.BigSemantics.MetadataNS.Builtins.PersonNS.AuthorNS;

// Developer should proof-read this TranslationScope before using it for production.
namespace Ecologylab.BigSemantics.Generated.Library 
{
	public class RepositoryMetadataTypesScope
	{
		public RepositoryMetadataTypesScope()
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
				typeof(AmazonBook),
				typeof(AmazonList),
				typeof(AmazonProduct),
				typeof(AnandtechReview),
				typeof(Anthropologie),
				typeof(AppleIProduct),
				typeof(AppleProductAccessory),
				typeof(AppleProductMac),
				typeof(ArtchiExhibition),
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
				typeof(AudioClipping),
				typeof(AudioSelfmade),
				typeof(BasicPublication),
				typeof(BedbathandbeyondProduct),
				typeof(BestbuyProduct),
				typeof(BggCategory),
				typeof(BggGame),
				typeof(BingSearchApi),
				typeof(BingSearchXpath),
				typeof(Blog),
				typeof(BoardGame),
				typeof(Body),
				typeof(Book),
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
				typeof(Commodity),
				typeof(CouchdbEntry),
				typeof(CrateandbarrelProduct),
				typeof(Dc),
				typeof(DcDocument),
				typeof(Disaster),
				typeof(Dlms),
				typeof(Earthquake),
				typeof(EbayProduct),
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
				typeof(GettyArtist),
				typeof(GettyArtistInfo),
				typeof(GettyCollection),
				typeof(GettyExploration),
				typeof(GettyObject),
				typeof(GettySearch),
				typeof(GettyWorkInfo),
				typeof(GlobeCartoon),
				typeof(GoogleBook),
				typeof(GoogleImageSearch),
				typeof(GooglePatent),
				typeof(GooglePatentAuthor),
				typeof(GoogleScholarArticle),
				typeof(GoogleScholarArticleFacts),
				typeof(GoogleScholarAuthor),
				typeof(GoogleScholarAuthorSearch),
				typeof(GoogleScholarAuthorSearchResult),
				typeof(GoogleScholarSearch),
				typeof(GoogleScholarSearchResult),
				typeof(GoogleSearch),
				typeof(Grant),
				typeof(GrantProgram),
				typeof(GrantStaff),
				typeof(GuggenArtwork),
				typeof(GuggenFilter),
				typeof(Head),
				typeof(Header),
				typeof(HmProduct),
				typeof(HomeDepotProduct),
				typeof(Hotel),
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
				typeof(JstorArticle),
				typeof(JstorJournal),
				typeof(JstorSearch),
				typeof(LabeledSpecifications),
				typeof(LandofnodProduct),
				typeof(LeagueAbility),
				typeof(LeagueChampion),
				typeof(LeagueRelationshipList),
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
				typeof(Outline),
				typeof(OverstockComProduct),
				typeof(Paragraph),
				typeof(Patent),
				typeof(PatentAuthor),
				typeof(PatentClassification),
				typeof(PdfMixin),
				typeof(Periodical),
				typeof(PersonnelInterview),
				typeof(Photostream),
				typeof(PieroneProduct),
				typeof(PinterestAuthor),
				typeof(PinterestPin),
				typeof(PinterestPinboard),
				typeof(PoliticalCartoon),
				typeof(Post),
				typeof(PostalAddress),
				typeof(PotterybarnProduct),
				typeof(Product),
				typeof(Publication),
				typeof(Publisher),
				typeof(PubmedArticle),
				typeof(PubmedAuthor),
				typeof(PubmedJournal),
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
				typeof(SageArticle),
				typeof(SamsclubProduct),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(ScopusArticle),
				typeof(ScopusAuthor),
				typeof(ScopusSearch),
				typeof(Search<>),
				typeof(SearchCrumb),
				typeof(SearchResult),
				typeof(SearchResults),
				typeof(Section),
				typeof(Sections),
				typeof(Seller),
				typeof(Service),
				typeof(SfuCartoonArchive),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(SlashdotSearch),
				typeof(SocialMediaSearchResult),
				typeof(SocialVideo),
				typeof(Specification),
				typeof(SpringerArticle),
				typeof(SpringerBook),
				typeof(SpringerEditor),
				typeof(SpringerJournal),
				typeof(SpringerSearch),
				typeof(SpringerSeriesSummary),
				typeof(Subject),
				typeof(TargetProduct),
				typeof(TateArtist),
				typeof(TateArtwork),
				typeof(TateFilter),
				typeof(TechReview),
				typeof(TedAuthor),
				typeof(TedPlaylist),
				typeof(TedTopic),
				typeof(TedauthorQuote),
				typeof(TedtalkVideo),
				typeof(TempFieldValueHolder),
				typeof(TermType),
				typeof(Thumbnail),
				typeof(TigerdirectProduct),
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
				typeof(TwitterApiMicroblog),
				typeof(TwitterMicroblog),
				typeof(TwitterSearchResults),
				typeof(UniqloProduct),
				typeof(UrbanSpoonSearch),
				typeof(VideoClipping),
				typeof(VideoInterview),
				typeof(VideoSelfmade),
				typeof(VimeoList),
				typeof(VimeoUser),
				typeof(VimeoVideo),
				typeof(WalmartProduct),
				typeof(WeatherReport),
				typeof(WebVideo),
				typeof(WestelmProduct),
				typeof(WhitneyArtwork),
				typeof(WhitneyDecade),
				typeof(WhitneySearch),
				typeof(WhitneyWatchAndListen),
				typeof(WikipediaCategoryType),
				typeof(WikipediaMobilePage),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
				typeof(WikipediaSearch),
				typeof(WileyArticle),
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
				typeof(YtPlaylist),
				typeof(YtTable),
				typeof(ZaraProduct));
		}
	}
}
