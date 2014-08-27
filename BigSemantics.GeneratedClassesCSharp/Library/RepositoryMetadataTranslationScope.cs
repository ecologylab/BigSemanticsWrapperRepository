
using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;


using Ecologylab.Semantics.Generated.Library.AcmAuthorNS;
using Ecologylab.Semantics.Generated.Library.AcmPortalInstitutionNS;
using Ecologylab.Semantics.Generated.Library.AcmPortalPublicationNS;
using Ecologylab.Semantics.Generated.Library.AcmPortalSearchNS;
using Ecologylab.Semantics.Generated.Library.AcmScholarlyArticleNS;
using Ecologylab.Semantics.Generated.Library.AmazonBookNS;
using Ecologylab.Semantics.Generated.Library.AmazonListNS;
using Ecologylab.Semantics.Generated.Library.AmazonProductNS;
using Ecologylab.Semantics.Generated.Library.AnandtechReviewNS;
using Ecologylab.Semantics.Generated.Library.AnthropologieProductNS;
using Ecologylab.Semantics.Generated.Library.AppleAccessoryProductNS;
using Ecologylab.Semantics.Generated.Library.AppleMacProductNS;
using Ecologylab.Semantics.Generated.Library.AppleProductNS;
using Ecologylab.Semantics.Generated.Library.ArtistNS;
using Ecologylab.Semantics.Generated.Library.ArtworkNS;
using Ecologylab.Semantics.Generated.Library.AskNatureFunctionNS;
using Ecologylab.Semantics.Generated.Library.AskNatureGroupNS;
using Ecologylab.Semantics.Generated.Library.AskNatureImageNS;
using Ecologylab.Semantics.Generated.Library.AskNatureProductNS;
using Ecologylab.Semantics.Generated.Library.AskNatureSubgroupNS;
using Ecologylab.Semantics.Generated.Library.AsosPageNS;
using Ecologylab.Semantics.Generated.Library.AsosProductNS;
using Ecologylab.Semantics.Generated.Library.AttractionListNS;
using Ecologylab.Semantics.Generated.Library.AttractionNS;
using Ecologylab.Semantics.Generated.Library.AuthorNS;
using Ecologylab.Semantics.Generated.Library.BasicPublicationNS;
using Ecologylab.Semantics.Generated.Library.BedbathandbeyondProductNS;
using Ecologylab.Semantics.Generated.Library.BestbuyProductNS;
using Ecologylab.Semantics.Generated.Library.BggBoardGameNS;
using Ecologylab.Semantics.Generated.Library.BingSearchNS;
using Ecologylab.Semantics.Generated.Library.BlogNS;
using Ecologylab.Semantics.Generated.Library.BlogPostNS;
using Ecologylab.Semantics.Generated.Library.BoardGameNS;
using Ecologylab.Semantics.Generated.Library.BritishCartoonArchiveNS;
using Ecologylab.Semantics.Generated.Library.CameraNS;
using Ecologylab.Semantics.Generated.Library.CartoonNS;
using Ecologylab.Semantics.Generated.Library.Cb2ProductNS;
using Ecologylab.Semantics.Generated.Library.CiteseerXSimilarNS;
using Ecologylab.Semantics.Generated.Library.CiteseerxCitingNS;
using Ecologylab.Semantics.Generated.Library.CiteseerxRecordNS;
using Ecologylab.Semantics.Generated.Library.CiteseerxSearchNS;
using Ecologylab.Semantics.Generated.Library.CiteseerxSummaryNS;
using Ecologylab.Semantics.Generated.Library.CiteulikeAuthorNS;
using Ecologylab.Semantics.Generated.Library.CiteulikePaperNS;
using Ecologylab.Semantics.Generated.Library.CiteulikeSearchNS;
using Ecologylab.Semantics.Generated.Library.CiteulikeTagNS;
using Ecologylab.Semantics.Generated.Library.CiteulikeUserNS;
using Ecologylab.Semantics.Generated.Library.CnetReviewNS;
using Ecologylab.Semantics.Generated.Library.CommentNS;
using Ecologylab.Semantics.Generated.Library.CommodityNS;
using Ecologylab.Semantics.Generated.Library.ContactPointNS;
using Ecologylab.Semantics.Generated.Library.CrateAndBarrelProductNS;
using Ecologylab.Semantics.Generated.Library.CreativeWorkNS;
using Ecologylab.Semantics.Generated.Library.CurationNS;
using Ecologylab.Semantics.Generated.Library.DisasterNS;
using Ecologylab.Semantics.Generated.Library.DleseRecordNS;
using Ecologylab.Semantics.Generated.Library.DleseUserSearchNS;
using Ecologylab.Semantics.Generated.Library.DreamHouseNS;
using Ecologylab.Semantics.Generated.Library.DublinCoreNS;
using Ecologylab.Semantics.Generated.Library.EarthquakeNS;
using Ecologylab.Semantics.Generated.Library.EbayProductNS;
using Ecologylab.Semantics.Generated.Library.EtsyProductNS;
using Ecologylab.Semantics.Generated.Library.EventNS;
using Ecologylab.Semantics.Generated.Library.ExhibitionNS;
using Ecologylab.Semantics.Generated.Library.FashionReviewerNS;
using Ecologylab.Semantics.Generated.Library.FastflipNS;
using Ecologylab.Semantics.Generated.Library.FlamencoFacetNS;
using Ecologylab.Semantics.Generated.Library.FlamencoObjectNS;
using Ecologylab.Semantics.Generated.Library.FlickrAuthorNS;
using Ecologylab.Semantics.Generated.Library.FlickrPhotoPostNS;
using Ecologylab.Semantics.Generated.Library.FlickrPhotostreamNS;
using Ecologylab.Semantics.Generated.Library.FlickrTagNS;
using Ecologylab.Semantics.Generated.Library.FondationArticleNS;
using Ecologylab.Semantics.Generated.Library.FondationCollectionNS;
using Ecologylab.Semantics.Generated.Library.FondationTagNS;
using Ecologylab.Semantics.Generated.Library.Forever21ProductNS;
using Ecologylab.Semantics.Generated.Library.GaurdianComicNS;
using Ecologylab.Semantics.Generated.Library.GetttyArtistNS;
using Ecologylab.Semantics.Generated.Library.GettyArtworkNS;
using Ecologylab.Semantics.Generated.Library.GettyCollectionNS;
using Ecologylab.Semantics.Generated.Library.GettyExplorationNS;
using Ecologylab.Semantics.Generated.Library.GettySearchNS;
using Ecologylab.Semantics.Generated.Library.GisLocationNS;
using Ecologylab.Semantics.Generated.Library.GlobeCartoonNS;
using Ecologylab.Semantics.Generated.Library.GoogleBookNS;
using Ecologylab.Semantics.Generated.Library.GooglePatentAuthorNS;
using Ecologylab.Semantics.Generated.Library.GooglePatentNS;
using Ecologylab.Semantics.Generated.Library.GoogleScholarArticleNS;
using Ecologylab.Semantics.Generated.Library.GoogleScholarAuthorNS;
using Ecologylab.Semantics.Generated.Library.GoogleScholarSearchNS;
using Ecologylab.Semantics.Generated.Library.GoogleSearchNS;
using Ecologylab.Semantics.Generated.Library.GrantNS;
using Ecologylab.Semantics.Generated.Library.GrantProgramNS;
using Ecologylab.Semantics.Generated.Library.GrantStaffNS;
using Ecologylab.Semantics.Generated.Library.GuggenArtworkNS;
using Ecologylab.Semantics.Generated.Library.GuggenFitlerNS;
using Ecologylab.Semantics.Generated.Library.HmProductNS;
using Ecologylab.Semantics.Generated.Library.HomeDepotProductNS;
using Ecologylab.Semantics.Generated.Library.HotelNS;
using Ecologylab.Semantics.Generated.Library.HouzzProductNS;
using Ecologylab.Semantics.Generated.Library.IcdlBookPreviewNS;
using Ecologylab.Semantics.Generated.Library.IcdlNS;
using Ecologylab.Semantics.Generated.Library.IeeeArticleBodyNS;
using Ecologylab.Semantics.Generated.Library.IeeeArticleNS;
using Ecologylab.Semantics.Generated.Library.IeeeAuthorNS;
using Ecologylab.Semantics.Generated.Library.IeeeCitedByNS;
using Ecologylab.Semantics.Generated.Library.IeeeJournalNS;
using Ecologylab.Semantics.Generated.Library.IeeeKeywordsNS;
using Ecologylab.Semantics.Generated.Library.IeeeReferencesNS;
using Ecologylab.Semantics.Generated.Library.IeeeSearchNS;
using Ecologylab.Semantics.Generated.Library.IkeaProductNS;
using Ecologylab.Semantics.Generated.Library.ImageSearchNS;
using Ecologylab.Semantics.Generated.Library.ImdbMovieNS;
using Ecologylab.Semantics.Generated.Library.ImdbMoviePersonNS;
using Ecologylab.Semantics.Generated.Library.InformaWorldScholarlyArticleNS;
using Ecologylab.Semantics.Generated.Library.InstructableAuthorNS;
using Ecologylab.Semantics.Generated.Library.InstructableNS;
using Ecologylab.Semantics.Generated.Library.InstructablesTagNS;
using Ecologylab.Semantics.Generated.Library.InvestigatorNS;
using Ecologylab.Semantics.Generated.Library.ItemNS;
using Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS;
using Ecologylab.Semantics.Generated.Library.LowesProductNS;
using Ecologylab.Semantics.Generated.Library.MetArtworkNS;
using Ecologylab.Semantics.Generated.Library.MetFilterNS;
using Ecologylab.Semantics.Generated.Library.MmArtworkNS;
using Ecologylab.Semantics.Generated.Library.ModclothProductNS;
using Ecologylab.Semantics.Generated.Library.ModclothSearchNS;
using Ecologylab.Semantics.Generated.Library.MomaArtistNS;
using Ecologylab.Semantics.Generated.Library.MomaArtworkNS;
using Ecologylab.Semantics.Generated.Library.MovieNS;
using Ecologylab.Semantics.Generated.Library.MoviePersonNS;
using Ecologylab.Semantics.Generated.Library.NetflixMovieNS;
using Ecologylab.Semantics.Generated.Library.NewMuseumArtistNS;
using Ecologylab.Semantics.Generated.Library.NewMuseumArtworkNS;
using Ecologylab.Semantics.Generated.Library.NeweggProductNS;
using Ecologylab.Semantics.Generated.Library.NewmuseumExhibitionNS;
using Ecologylab.Semantics.Generated.Library.NewmuseumFilterNS;
using Ecologylab.Semantics.Generated.Library.NewsArticleNS;
using Ecologylab.Semantics.Generated.Library.NsdlDocumentNS;
using Ecologylab.Semantics.Generated.Library.NsdlServiceNS;
using Ecologylab.Semantics.Generated.Library.NsfAwardGrantNS;
using Ecologylab.Semantics.Generated.Library.NsfDivisionNS;
using Ecologylab.Semantics.Generated.Library.NsfInvestigatorNS;
using Ecologylab.Semantics.Generated.Library.NsfProgramNS;
using Ecologylab.Semantics.Generated.Library.NsfSearchNS;
using Ecologylab.Semantics.Generated.Library.NsfStaffListNS;
using Ecologylab.Semantics.Generated.Library.NsfStaffNS;
using Ecologylab.Semantics.Generated.Library.NytimesArticleNS;
using Ecologylab.Semantics.Generated.Library.OnekingslaneProductNS;
using Ecologylab.Semantics.Generated.Library.OpenDNSDomainNS;
using Ecologylab.Semantics.Generated.Library.OpmlNS;
using Ecologylab.Semantics.Generated.Library.OverstockProductNS;
using Ecologylab.Semantics.Generated.Library.PatentAuthorNS;
using Ecologylab.Semantics.Generated.Library.PatentClassificationNS;
using Ecologylab.Semantics.Generated.Library.PatentNS;
using Ecologylab.Semantics.Generated.Library.PeriodicalNS;
using Ecologylab.Semantics.Generated.Library.PersonNS;
using Ecologylab.Semantics.Generated.Library.PieroneProductNS;
using Ecologylab.Semantics.Generated.Library.PinterestNS;
using Ecologylab.Semantics.Generated.Library.PoliticalCartoonNS;
using Ecologylab.Semantics.Generated.Library.PostalAddressNS;
using Ecologylab.Semantics.Generated.Library.PrimitivesNS;
using Ecologylab.Semantics.Generated.Library.ProductNS;
using Ecologylab.Semantics.Generated.Library.PublicationNS;
using Ecologylab.Semantics.Generated.Library.PublisherNS;
using Ecologylab.Semantics.Generated.Library.PubmedArticleNS;
using Ecologylab.Semantics.Generated.Library.PubmedAuthorNS;
using Ecologylab.Semantics.Generated.Library.PubmedJournalNS;
using Ecologylab.Semantics.Generated.Library.RatingNS;
using Ecologylab.Semantics.Generated.Library.ResearchGateSearchNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateArticleNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateAuthorNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateInstitutionDepartmentNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateInstitutionNS;
using Ecologylab.Semantics.Generated.Library.ResearchgateResearcherNS;
using Ecologylab.Semantics.Generated.Library.RestaurantNS;
using Ecologylab.Semantics.Generated.Library.RestorationHardwareProductNS;
using Ecologylab.Semantics.Generated.Library.ReviewNS;
using Ecologylab.Semantics.Generated.Library.RhizomeArtistNS;
using Ecologylab.Semantics.Generated.Library.RhizomeArtworkNS;
using Ecologylab.Semantics.Generated.Library.RhizomeCollectionNS;
using Ecologylab.Semantics.Generated.Library.RhizomeTagNS;
using Ecologylab.Semantics.Generated.Library.RottenTomatoeMovieNS;
using Ecologylab.Semantics.Generated.Library.RottenTomatoeMoviePersonNS;
using Ecologylab.Semantics.Generated.Library.Rss22NS;
using Ecologylab.Semantics.Generated.Library.RssNS;
using Ecologylab.Semantics.Generated.Library.RwandaPersonnelInterviewNS;
using Ecologylab.Semantics.Generated.Library.RwandaTribunalVoicesNS;
using Ecologylab.Semantics.Generated.Library.RwandaVideoInterviewNS;
using Ecologylab.Semantics.Generated.Library.SamsclubProductNS;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.Semantics.Generated.Library.ScienceDirectArticleNS;
using Ecologylab.Semantics.Generated.Library.ScopusArticleNS;
using Ecologylab.Semantics.Generated.Library.ScopusAuthorNS;
using Ecologylab.Semantics.Generated.Library.ScopusSearchNS;
using Ecologylab.Semantics.Generated.Library.SearchNS;
using Ecologylab.Semantics.Generated.Library.ServiceNS;
using Ecologylab.Semantics.Generated.Library.SfuCartoonArchiveNS;
using Ecologylab.Semantics.Generated.Library.SlashdotPostNS;
using Ecologylab.Semantics.Generated.Library.SlashdotRSSNS;
using Ecologylab.Semantics.Generated.Library.SlashdotSearchNS;
using Ecologylab.Semantics.Generated.Library.TargetProductNS;
using Ecologylab.Semantics.Generated.Library.TateArtistNS;
using Ecologylab.Semantics.Generated.Library.TateArtworkNS;
using Ecologylab.Semantics.Generated.Library.TateFilterNS;
using Ecologylab.Semantics.Generated.Library.TechReviewNS;
using Ecologylab.Semantics.Generated.Library.ThumbnailNS;
using Ecologylab.Semantics.Generated.Library.TigerdirectProductNS;
using Ecologylab.Semantics.Generated.Library.TripAdvisorNS;
using Ecologylab.Semantics.Generated.Library.TrumanCampaignCartoonNS;
using Ecologylab.Semantics.Generated.Library.TumblrPostNS;
using Ecologylab.Semantics.Generated.Library.TumblrSearchNS;
using Ecologylab.Semantics.Generated.Library.TvShowEpisodeNS;
using Ecologylab.Semantics.Generated.Library.TvShowNS;
using Ecologylab.Semantics.Generated.Library.TvtropesNS;
using Ecologylab.Semantics.Generated.Library.TweetNS;
using Ecologylab.Semantics.Generated.Library.TweeterNS;
using Ecologylab.Semantics.Generated.Library.TwitterBlogNS;
using Ecologylab.Semantics.Generated.Library.TwitterSearchNS;
using Ecologylab.Semantics.Generated.Library.UniqloProductNS;
using Ecologylab.Semantics.Generated.Library.UrbanspoonResterauntNS;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.Generated.Library.WalmartProductNS;
using Ecologylab.Semantics.Generated.Library.WayfairProductNS;
using Ecologylab.Semantics.Generated.Library.WeatherReportNS;
using Ecologylab.Semantics.Generated.Library.WestelmProductNS;
using Ecologylab.Semantics.Generated.Library.WhitneyArtworkNS;
using Ecologylab.Semantics.Generated.Library.WhitneyDecadeNS;
using Ecologylab.Semantics.Generated.Library.WhitneySearchNS;
using Ecologylab.Semantics.Generated.Library.WhitneyWatchAndListenNS;
using Ecologylab.Semantics.Generated.Library.WikipediaMobileNS;
using Ecologylab.Semantics.Generated.Library.WikipediaPageNS;
using Ecologylab.Semantics.Generated.Library.WikipediaPageTypeNS;
using Ecologylab.Semantics.Generated.Library.YahooRssNS;
using Ecologylab.Semantics.Generated.Library.YahooSearchNS;
using Ecologylab.Semantics.Generated.Library.YelpBusinessNS;
using Ecologylab.Semantics.Generated.Library.ZaraProductNS;

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
				typeof(Designer),
				typeof(Disaster),
				typeof(DleseGetRecord),
				typeof(DleseRecord),
				typeof(DleseRecord2),
				typeof(DleseRecordHead),
				typeof(DleseUserSearch),
				typeof(Dlms),
				typeof(Earthquake),
				typeof(EbayProduct),
				typeof(Educational),
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
				typeof(Grant),
				typeof(GrantProgram),
				typeof(GrantStaff),
				typeof(GuggenArtwork),
				typeof(GuggenFilter),
				typeof(Head),
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
				typeof(LabeledSpecifications),
				typeof(LandofnodProduct),
				typeof(LeagueAbility),
				typeof(LeagueChampion),
				typeof(LeagueRelationshipList),
				typeof(Lifecycle),
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
				typeof(SocialMediaSearchResult),
				typeof(SocialVideo),
				typeof(Specification),
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
				typeof(WikipediaCategoryType),
				typeof(WikipediaMobilePage),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
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
